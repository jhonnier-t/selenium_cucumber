Feature: Form Fit ideas
  How user, fill form on the page
  Scenario: Entry the page
    Given the user find on the page "Inicio - Fit Ideas"
    When the user click on the button Contactenos
    Then verify the title "CONTÁCTENOS"

  Scenario Outline: Fill form
    Given the user on site "Contáctenos - Fit Ideas"
    When click on the checkbox of ask in "No"
    And cick on the name and fill <Name>
    And cick on the Telefono and fill <Cel>
    And cick on the Email and fill <Email>
    And cick on the Asunto and fill <Asunto>
    And cick on the Mensaje and fill <Mensaje>
    Then check fields arent empty
    Examples:
      | Name     | Cel        | Email         | Asunto              | Mensaje                                          |
      | Jhonnier | 3148187000 | jho@gmail.com | Prueba Automatizada | Esto es una prueba hecha con Selenium y Cucumber |


