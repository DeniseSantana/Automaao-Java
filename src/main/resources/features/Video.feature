@web @demo
Feature: video

  @CT=22
  Scenario: video
    Given que estou na tela principal do site
    When clico em  video e depois clico em you to be
    Then valido que estou na tela video com sucesso

  @CT=23
  Scenario: video
    Given que estou na tela principal do site
    When clico em video e depois clico em vimeo
    Then valido que estou na tela vimeo com sucesso
