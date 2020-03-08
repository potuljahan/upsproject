@upstraking @Functional
Feature: Users ability to Navigate Tracking link
Scenario: User should able to Navigate Tracking link in home page so that view all track Shipment option

  Given User logs in  to UPS web application
  When User lands on ups homepage
  And User sees tracking button on the second button from the upper right
  And Complete to Navigate on tracking button
  Then user sees drop down list of all tracking option

