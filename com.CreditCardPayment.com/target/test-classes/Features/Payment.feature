Feature: CreditCard Payment Gateway 

Scenario Outline: 1 Successfull Credit Card Payment 
    Given I opens browser
    Then user Navigate to Application 
    And click on BuyOption 
    And I open my shopping cart
    And I enter Creditcard "<Number>"
   Then  verify successfull payment message 
   
Scenario Outline: 2 UnSuccessfull Credit Card Payment 
    Given I opens browser
    Then user Navigate to Application 
    And click on BuyOption 
    And I open my shopping cart
    And I enter Creditcard "<Number>"
   Then  verify unsuccessfull payment message 
      
Examples:
 |Card Number        |
 |4811 1111 1111 1114|
 |4911 1111 1111 1113|