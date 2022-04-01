@web @google
Feature: Switch

  @CT=15
  Scenario: Switch to
    Given que estou na tela switch to
    When clico em alerts
    Then valido que estou na tela alerts com sucesso

  @CT=16
  Scenario: 
    Given que estou na tela switch to
    When clico em alerts e depois clico em alert ok ou cancel
    Then valido que estou na tela com sucesso

  @CT=17
  Scenario: Switch to
    Given que estou na tela switch to
    When clico em alerts e depois clico em alert textbox
    Then valido com sucesso que estou na pagina

  @CT=18
  Scenario: Switch to
    Given que estou na tela switch to
    When clico em windows
    Then valido com sucesso a tela windows

  @CT=19
  Scenario: Switch to
    Given que estou na tela switch to
    When clico em windows e depois clico em seperate windows
    Then valido com sucesso a tela windows with
    
    @CT=20
  Scenario: Switch to
    Given que estou na tela switch to
    When clico em windows e depois clico em multiplique windows
    Then valido com sucesso a tela windows multiplique
    
     @CT=21
  Scenario: Switch to
    Given que estou na tela switch to
    When clico em windows e depois clico em frames
    Then valido com sucesso a tela frames
    
