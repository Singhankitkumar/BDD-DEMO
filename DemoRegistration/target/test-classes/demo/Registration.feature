#Author: Ankit Kumar Singh
Feature: Registration
 Register students with valid age
  Scenario: Register students
    Given student Name and age
    When for valid age
    Then successful registration and store into db
   
