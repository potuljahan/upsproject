$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PotulUpsShipment.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to create a shipment package \u0026 flight",
  "description": "",
  "id": "users-ability-to-create-a-shipment-package-\u0026-flight",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@shipment"
    },
    {
      "line": 1,
      "name": "@upspackageflight"
    },
    {
      "line": 1,
      "name": "@Functional"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@potul"
    }
  ]
});
formatter.before({
  "duration": 3532556700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user should able to Navigate shipping link in home page  so that create a shipment package \u0026 flight",
  "description": "",
  "id": "users-ability-to-create-a-shipment-package-\u0026-flight;user-should-able-to-navigate-shipping-link-in-home-page--so-that-create-a-shipment-package-\u0026-flight",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user lands on ups homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user sees shipping button also Navigate it",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Navigate shipment package \u0026 flight page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user fill up all required field",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "finish shipment with continue",
  "keyword": "And "
});
formatter.match({
  "location": "UPSpackageflight.user_lands_on_ups_homepage()"
});
formatter.result({
  "duration": 6408702000,
  "status": "passed"
});
formatter.match({
  "location": "UPSpackageflight.user_sees_shipping_button()"
});
formatter.result({
  "duration": 5323573900,
  "status": "passed"
});
formatter.match({
  "location": "UPSpackageflight.navigate_shipment_package_flight_page()"
});
formatter.result({
  "duration": 6515245500,
  "status": "passed"
});
formatter.match({
  "location": "UPSpackageflight.user_fil_up_all_required_field()"
});
formatter.result({
  "duration": 17431222700,
  "status": "passed"
});
formatter.match({
  "location": "UPSpackageflight.finish_shipment_with_continue()"
});
formatter.result({
  "duration": 5000154200,
  "status": "passed"
});
formatter.after({
  "duration": 808008000,
  "status": "passed"
});
});