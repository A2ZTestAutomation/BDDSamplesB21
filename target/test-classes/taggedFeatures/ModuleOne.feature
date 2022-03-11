@PhaseOne
Feature: Contact and Deal Functions

Background: User login
Given User must login


@RegressionTest
Scenario: Create new Contact
When User create a new contact

@SmokeTest
Scenario: View a contact
When User view a contact

@IntegrationTest
Scenario: Edit a contact
When User edit contact details


Scenario: Create new Deal
When User create a new deal


Scenario: View a deal
When User view deal details


Scenario: User logout
When User Logout from App