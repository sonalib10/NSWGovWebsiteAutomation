$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/verifySelectedTopics.feature");
formatter.feature({
  "name": "Verify selected topics on nsw website",
  "description": "  This test case is to verify user can select topics from NSW website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify topics",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to NSW page",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectTopics.naviagteToWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Topic and sub topics",
  "keyword": "When "
});
formatter.match({
  "location": "SelectTopics.selectTopicAndSubTopics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Topics are selected and filter is applied",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectTopics.verifyTopic()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": To verify filter functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to NSW page",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectTopics.naviagteToWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Topic and sub topics",
  "keyword": "When "
});
formatter.match({
  "location": "SelectTopics.selectTopicAndSubTopics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify reset filter button removes applied filter on topics",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectTopics.verifyResetRemovesAppliedFilter()"
});
formatter.result({
  "status": "passed"
});
});