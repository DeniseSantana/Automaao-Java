@web @demo
Feature: wysi

  @CT=24
  Scenario: wysiwig
    Given que estou na tela principal wysiwig
    When clico em  wysiwig e depois clico em tinymce
    Then valido que estou na pagina wysiwig com sucesso

  @CT=25
  Scenario: wysiwig
    Given que estou na tela principal wysiwig
    When clico em wysiwyg e depois clico em ckeditor
    Then valido que estou na pagina ckeditor com sucesso
    
     @CT=26
  Scenario: wysiwig
    Given que estou na tela principal wysiwig
    When clico em wysiwyg e depois clico em summernote
    Then valido que estou na pagina summernote com sucesso
    
     @CT=27
  Scenario: wysiwig
    Given que estou na tela principal wysiwig
    When clico em wysiwyg e depois clico em codemirror
    Then valido que estou na pagina codemirror com sucesso