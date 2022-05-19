Feature: Multiple actions on settings page

  Background:
    Given user enters "fikkodolt8@vusra.com" in the email field
    And clicks continue button
    And enters "121212Aa" in the password field
    And clicks Login button
    Then Home page is loaded
    Given User taps profile icon
    And Taps three dots menu
    And User taps settings option


  @Android
  Scenario: Update age
    Given user taps personal information option
    And taps age option
    And enters age in the edit age field
    And taps edit age Done button
    Then age update toast should be visible

  @Android
  Scenario: Update theme
    Given user taps account management option
    And taps app theme option
    And selects a theme
    Then theme should be updated

  @Android
  Scenario: Turn off a topic from history
    Given user taps home feed tuner option
    And taps history option
    And taps Turn off button for a topic
    Then recommendation should be turned off

  @Android
  Scenario: Remove a topic
    Given user taps home feed tuner option
    And taps topics option
    And taps remove button for a topic
    Then topic should be removed

  @Android
  Scenario: Turn off email notification
    Given User taps Notifications option
    And taps By Email option
    And taps turn off all button
    And taps turn off all button again
    Then Email notifications should be turned off