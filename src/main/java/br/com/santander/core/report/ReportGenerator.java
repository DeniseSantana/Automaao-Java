package br.com.santander.core.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import br.com.santander.core.report.generator.Generator;
import br.com.santander.core.report.generator.GeneratorFactory;
import br.com.santander.core.report.model.ReportFileStructure;
import br.com.santander.core.report.model.Header;
import br.com.santander.core.report.model.Report;
import br.com.santander.core.report.utils.DateTimeUtils;
import br.com.santander.core.report.utils.ReportProperties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReportGenerator {

	private Report report;
	private ReportProperties prop;
	private List<Generator> generators;
	private List<File> separateFiles;

	private static final String DATE_FIELD_NAME = "Date";
	private static final String DATE_FIELD_FORMAT = "dd/MM/yyyy - HH:mm:ss";
	private static final String PROJECT_FIELD_NAME = "Project";
	private static final String STATUS_FIELD_NAME = "Status";
	private static final String TESTER_FIELD_NAME = "Tester";
	private static final String TEST_DESCRIPTION_FIELD_NAME = "Test Description";
	private static final String DEFAULT_TITLE = "TEST REPORT";
	private static final String DEFAULT_SECTION_TITLE = "Test Information";
	private static final String STATUS_PASSED = "PASSED";

	public ReportGenerator() {
		try {
			prop = new ReportProperties();
		} catch (Exception e) {
			throw new RuntimeException(
					"Could not load report configuration. Check if you have report.properties in the resources folder.",
					e);
		}

		report = new Report();

		if (prop.reportIsActive()) {

			separateFiles = new ArrayList<>();

			// create report directory if it does not exist
			File reportDirectory = new File("./" + prop.getReportDirectory() );
			if (!reportDirectory.exists()) {
				reportDirectory.mkdir();
			}

			// add generators
			generators = new ArrayList<>();
			for (String type : prop.getReportFileTypes()) {
				generators.add(GeneratorFactory.getGenerator(type, report));
			}
		}
	}

	public void addSeparateFileToReport(File file) {
		separateFiles.add(file);
	}

	public void registerStep(byte[] image, String description) {
		if (image != null) {
			report.addStep(image, description);
		}
	}
	
	public void registerStep(byte[] image) {
		registerStep(image, "");
	}

	public List<File> buildReport(Header header, String id, String scenarioName, ReportFileStructure fileStructure, boolean scenarioStatus) {
		if (prop.reportIsActive() && !report.stepsAreEmpty()) {
			// list of files to be returned
			List<File> reportFiles = new ArrayList<>();

			// adding info to report model
			report.setFileStructure(fileStructure);
			report.addHeader(header);

			// generate a file for all formats in properties
			for (Generator generator : generators) {
				try {
					generator.initDocument(id, scenarioName, scenarioStatus, fileStructure);
					generator.addHeader();
					generator.addSteps();
					reportFiles.add(generator.saveFile());
				} catch (Exception e) {
					log.error(generator.getClass().getSimpleName() + " failed: " + e.getMessage());
					e.printStackTrace();
				}
			}

			for (File file : separateFiles) {
				reportFiles.add(file);
			}

			// clear steps and separate files for next report
			report.clearSteps();
			separateFiles.clear();

			return reportFiles;
		} else {
			return new ArrayList<>();
		}
	}

	public List<File> buildReport(String id, String scenarioName, String scenarioStatus, ReportFileStructure fileStructure)
			throws Exception {
		return buildReport(createDefaultHeader(scenarioName, scenarioStatus), id, scenarioName, fileStructure, scenarioStatus.equalsIgnoreCase(STATUS_PASSED));
	}

	private Header createDefaultHeader(String scenarioName, String scenarioStatus) {
		Header headerObj = new Header(DEFAULT_TITLE);
		headerObj.addFieldToSection(DEFAULT_SECTION_TITLE, PROJECT_FIELD_NAME, prop.getProject());
		headerObj.addFieldToSection(DEFAULT_SECTION_TITLE, TESTER_FIELD_NAME, prop.getTester());
		headerObj.addFieldToSection(DEFAULT_SECTION_TITLE, TEST_DESCRIPTION_FIELD_NAME, scenarioName);
		headerObj.addFieldToSection(DEFAULT_SECTION_TITLE, DATE_FIELD_NAME,
				DateTimeUtils.getFormattedDate(DATE_FIELD_FORMAT));
		headerObj.addFieldToSection(DEFAULT_SECTION_TITLE, STATUS_FIELD_NAME, scenarioStatus);

		return headerObj;
	}

}
