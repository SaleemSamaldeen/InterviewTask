Feature: A demo to work on cucumber regression cases

  #Background runs before each of our scenario and scenario outline
  Background: Background steps to reach login page
    Given I have a linkedin account
    And I enter valid username - saleemsamaldeen1991@gmail.com and password - Linkedinjobs@1
    When I click Submit button
    Then User is successfully logged in

  @001JobsAlert
  Scenario Outline: Verify username and jobs alert
    And I verify <username> displayed in home page
    Then I verify my jobs alert
    Examples:
      | username        |
      | saleemsamaldeen |

  @002LoginAndLogout
  Scenario Outline: Verify username and Logout
    And I verify <username> displayed in search results page
    Then Logout user and reaches home page
    Examples:
      | username        |
      | saleemsamaldeen |

  @003Messages
  Scenario: Verify my messages
    And I verify my messages



