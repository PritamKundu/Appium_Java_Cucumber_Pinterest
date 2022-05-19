Feature: Multiple actions on profile page

  Background:
    Given user enters "fikkodolt6@vusra.com" in the email field
    And clicks continue button
    And enters "121212A" in the password field
    And clicks Login button
    Then Home page is loaded

  @Android
  Scenario: Copy profile link
    Given User taps profile icon
    When user taps share icon
    And taps copy link icon
    Then copy link toast should be visible

  @Android
  Scenario: Share profile on pinterest
    Given User taps profile icon
    When user taps share icon
    And taps share on pinterest icon
    And taps import contact button
    Then Access permission modal is displayed

  @Android
  Scenario Outline: User creates new board
    Given User taps profile icon
    And User taps plus icon
    When Taps Board
    And Enters board "<name>"
    And Taps next
    And Taps Done button
    Then Board should be created

    Examples:
      | name    |
      | Cricket |

  @Android
  Scenario Outline: Update profile info
    Given User taps profile icon
    And Taps three dots menu
    When User taps edit public profile
    And enters "<lastname>" in the last name field
    And taps profile edit done button
    Then Profile should be updated

    Examples:
      | lastname |
      | A        |
