Feature: Test Home page navigation

  Scenario: Visit Web Form page
    Given I am at the home page "https://formy-project.herokuapp.com/"
    When I click on web form page
    Then I will be on web form page "https://formy-project.herokuapp.com/form"

  Scenario: Visit Autocomplete page
    Given I am at the home page "https://formy-project.herokuapp.com/"
    When I click on auto complete page
    Then I will be on auto complete page "https://formy-project.herokuapp.com/autocomplete"

  Scenario: Visit Buttons page
    Given I am at the home page "https://formy-project.herokuapp.com/"
    When I click on button page
    Then I will be on button page "https://formy-project.herokuapp.com/buttons"