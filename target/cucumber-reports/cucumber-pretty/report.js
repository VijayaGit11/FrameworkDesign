$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/Documents/Framework/Framework/src/test/java/features/CRMLoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login page feature",
  "description": "\r\nDescription: This feature is for Login Page validation",
  "id": "login-page-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  Scenario Outline: Login Page validation"
    }
  ],
  "line": 6,
  "name": ":Login page validation",
  "description": "",
  "id": "login-page-feature;:login-page-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User is already on Login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#    Then User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    }
  ],
  "line": 11,
  "name": "User clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#    Then user is on home page"
    },
    {
      "line": 13,
      "value": "#    And User navigates to deals page"
    }
  ],
  "line": 14,
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 26717257100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.User_Enters_Username_Password()"
});
formatter.result({
  "duration": 1902858600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 265415400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.User_closest_the_browser()"
});
formatter.result({
  "duration": 2913358200,
  "status": "passed"
});
});