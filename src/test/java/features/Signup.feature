Feature: Signup test

  @Android
  Scenario Outline: User signs up with email
    Given user enters "<email>" in the email field for signup
    And clicks continue button for signup
    When User enters "<password>" in the password field
    And clicks next button
    And enters "<name>" in the full name field
    And clicks next button
    And enters "<age>" in the age field
    And clicks next button
    And selects a gender
    And selects a country
    And selects five topics
    And clicks topic next button
    Then Home page is loaded

    Examples:
      | email                | password | name | age |
      | fikkodolt4@vusra.com | 121212A  | abcd | 25  |

