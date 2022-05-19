Feature: Test multiple actions on pins

  Background:
    Given user enters "fikkodolt6@vusra.com" in the email field
    And clicks continue button
    And enters "121212A" in the password field
    And clicks Login button
    Then Home page is loaded

  @Android
  Scenario: user opens a post
    Given user taps a post
    Then post is opened

  @Android
  Scenario: user saves a post
    Given user taps a post
    When post is opened
    And user taps save button
    Then post shall be saved