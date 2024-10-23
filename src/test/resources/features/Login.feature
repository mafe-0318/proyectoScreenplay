@login
Feature: Login

  @LoginSuccessful
  Scenario Outline: Login exitoso
    Given El cliente abre la pagina web
    When diligencia los datos "<usuario>" y "<contrasena>"
    Then debe ver el texto de productos "<validtext>"
    Examples:
      |usuario      |contrasena  |validtext|
      |standard_user|secret_sauce|Sauce Labs Backpack|


  Scenario Outline: Login fallido
    Given El cliente abre la pagina web
    When diligencia los datos "<usuario>" y "<contrasena>"
    Then debe ver el mensaje de error "<validbloqueo>"
    Examples:
      |usuario      |contrasena  |validbloqueo|
      |locked_out_user|secret_sauce |Epic sadface: Sorry, this user has been locked out.|




