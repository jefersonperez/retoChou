Feature: crear una nueva Business Unit

  Scenario Outline: crear una nueva Business Unit
    Given I am on the home page StarSharp
    When I perform the authentication in the application
      | user   | password   |
      | <user> | <password> |
    When I go to the menu organizations business units
    And I create a new business unit
      | name   | 
      | <name> | 
      And I create a new meeting
    |meetingName|meetingNumber|
    |<meetingName>|<meetingNumber>|
    Then I verify the meeting

    Examples: 
      | user  | password | name     | meetingName 					 | meetingNumber | 
      | admin | serenity | Unidad1  |     Prueba Choucair    | 001				   |
