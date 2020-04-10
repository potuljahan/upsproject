@shipment @upspackageflight @Functional @regression @potul 
Feature: Users ability to create a shipment package & flight 
Scenario: user should able to Navigate shipping link in home page  so that create a shipment package & flight 

	Given user lands on ups homepage 
	When user sees shipping button also Navigate it 
	And Navigate shipment package & flight page 
	Then user fill up all required field 
	And finish shipment with continue 