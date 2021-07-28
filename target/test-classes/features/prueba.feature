Feature: crear nueva Business Unit

  Scenario Outline: crear nueva Business Unit
    Given I am on the home page StarSharp
    When I perform the authentication in the application
      | user   | password   |
      | <user> | <password> |
    When I go to the menu organizations business units
    And I create a new business unit
      | name   | 
      | <name> | 
      And I create a new meeting
    |meetingName|meetingNumber|meetingUnit|
    |<meetingName>|<meetingNumber>|<meetingUnit>|
    Then I verify the meeting
    | nameValidate   | 
      | <nameValidate> | 

    Examples: 
      | user  | password | name     | meetingName 					 | meetingNumber |meetingUnit |nameValidate				  | 
      | admin | serenity | Unidad3  |     Prueba Choucair    | 001				   | Unidad3    |Prueba Choucair		  |
