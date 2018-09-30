Feature: Testing PetClinic

Scenario: View Records
Given As a Vet 
When I want to see records
Then So that I can recommend the type of care to give their animals

Scenario: Update Records
Given As an administrator
When I want to update records
Then So that the correct prices 
And updates are sent.

Scenario: Delete Records
Given As an administrator
When i want to delete animal records
Then so that check up emails aren't sent to deceased animals

Scenario: Add new animals to records
Given As an administrator
When I want to add new animals to our records
Then So that I can quickly add new customers to our files

Scenario: Add owners to records
Given As an administrator,
When i want to add new owners to our records,
Then So that paper work is kept to a minimum 
And can be filled out with the help of the customer
