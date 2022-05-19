Feature: Test multiple actions on Home page

  Background:
    Given user enters "fikkodolt7@vusra.com" in the email field
    And clicks continue button
    And enters "121212A" in the password field
    And clicks Login button
    Then Home page is loaded

  @Android
  Scenario Outline: User wants to search a topic
    Given user clicks search icon
    And clicks search bar input field
    When user enter a "<topic>" name and clicks enter
    Then search result is displayed

    Examples:
      | topic  |
      | soccer |

  @Android
  Scenario: User wants to search a popular topic
    Given user clicks search icon
    And taps on a popular topic
    Then search result is displayed

  @Android
  Scenario Outline: user wants to send message
    Given user clicks inbox icon
    And clicks Messages button
    And user clicks email input field
    When user enters "<email>" in the contact field
    And selects a contact
    And clicks contact next button
    And enters "<message>" in the message field
    And clicks send icon
    Then message is sent
    Examples:
      | email                | message |
      | abir0dhaka@gmail.com | Hello   |

  @Android
  Scenario: user wants to filter updates
    Given user clicks inbox icon
    When user taps filter icon
    And selects photos option
    Then filtered page should be loaded

