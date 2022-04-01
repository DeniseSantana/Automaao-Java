@web @demo
Feature: login

  @CT=1
  Scenario: criar usuario
    Given que estou na tela principal
    When seleciono a opçao skip sign e insiro meus dados válidos
    Then crio usuario com sucesso

  @CT=2
  Scenario: realizar login
    Given que estou na tela de login
    When insiro usuario e senha
    Then e realizado o login com sucesso

  @CT=3
  Scenario: realizar login invalido
    Given que estou na tela de login
    When insiro usuario e senha incorreto
    Then e realizado o login invalido
