$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosPage.feature");
formatter.feature({
  "line": 2,
  "name": "Background color change finctionality",
  "description": "",
  "id": "background-color-change-finctionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "1 Sky Blue Background",
  "description": "",
  "id": "background-color-change-finctionality;1-sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button As \"Set SkyBlue Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "TechFiosPageStepDefinitions.button_exists(String)"
});
formatter.result({
  "duration": 4120319577,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[xyz]\u003e but was:\u003c[Set SkyBlue Background]\u003e\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\n\tat steps.TechFiosPageStepDefinitions.button_exists(TechFiosPageStepDefinitions.java:27)\n\tat ✽.Given \"Set SkyBlue Background\" button exists(features/TechfiosPage.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 26
    }
  ],
  "location": "TechFiosPageStepDefinitions.i_click_on_the_button_As(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TechFiosPageStepDefinitions.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "2 White Background Change",
  "description": "",
  "id": "background-color-change-finctionality;2-white-background-change",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "\"Set White Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the button As \"Set White Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 1
    }
  ],
  "location": "TechFiosPageStepDefinitions.button_exists(String)"
});
formatter.result({
  "duration": 2934424543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 26
    }
  ],
  "location": "TechFiosPageStepDefinitions.i_click_on_the_button_As(String)"
});
formatter.result({
  "duration": 93569196,
  "status": "passed"
});
formatter.match({
  "location": "TechFiosPageStepDefinitions.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 266067027,
  "status": "passed"
});
});