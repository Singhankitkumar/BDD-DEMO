#Author: Ankit Kumar Singh
Feature: Create new Account
create a new account with valid customer and sufficient balance
 Scenario: Create account
    Given customer and opening balance 
    When For valid customer
    And valid opening balance create account number
    Then create account and store it in db
   

 