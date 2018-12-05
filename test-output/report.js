$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Google page searching feature.",
  "description": "",
  "id": "google-page-searching-feature.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Google page searching Test Scenario",
  "description": "",
  "id": "google-page-searching-feature.;google-page-searching-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on searching page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of page is Google",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter information they want to search",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "searchSteps.userOnPage()"
});
formatter.result({
  "duration": 6669809604,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.getTitle()"
});
formatter.result({
  "duration": 35807073,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.enterInfo()"
});
formatter.result({
  "duration": 3240220345,
  "status": "passed"
});
formatter.match({
  "location": "searchSteps.closeBrowser()"
});
formatter.result({
  "duration": 938902923,
  "status": "passed"
});
});