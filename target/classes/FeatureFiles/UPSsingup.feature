@UPSsingup @Functional
Feature: As user I want to Sign up for UPS
Scenario: Sign up for UPS account

 Given Browse to ups home page
 When Navigate on sign up page
 And put name <Name>, email <Email>, user ID <User ID>, password <password>
 Then check mark in agreement field
 And Navigate on the signup button
 And landed on user Account pageFeature: user ability to create a shipment package & flight


