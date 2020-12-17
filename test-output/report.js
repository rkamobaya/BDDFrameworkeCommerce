$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing of the login page",
  "description": "",
  "id": "login-functionality;testing-of-the-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters Email as \"admin@yourstore.com\" and \"admin\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 4152402201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 8169758300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "Steps.user_enters_Email_as_and_as_password(String,String)"
});
formatter.result({
  "duration": 183724000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_login()"
});
formatter.result({
  "duration": 7808777800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 46452700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Logout_link()"
});
formatter.result({
  "duration": 3847396000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 20665000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_close_browser()"
});
formatter.result({
  "duration": 597949000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "login data driven",
  "description": "",
  "id": "login-functionality;login-data-driven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters Email as \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login-functionality;login-data-driven;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 26,
      "id": "login-functionality;login-data-driven;;1"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 27,
      "id": "login-functionality;login-data-driven;;2"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin123"
      ],
      "line": 28,
      "id": "login-functionality;login-data-driven;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "login data driven",
  "description": "",
  "id": "login-functionality;login-data-driven;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters Email as \"admin@yourstore.com\" and \"admin\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 3026457201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 8280611500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "Steps.user_enters_Email_as_and_as_password(String,String)"
});
formatter.result({
  "duration": 198759499,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_login()"
});
formatter.result({
  "duration": 7372893700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 24708500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Logout_link()"
});
formatter.result({
  "duration": 3840242301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 18728300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_close_browser()"
});
formatter.result({
  "duration": 594334600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "login data driven",
  "description": "",
  "id": "login-functionality;login-data-driven;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters Email as \"admin@yourstore.com\" and \"admin123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 3054593399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 8196414100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin123",
      "offset": 48
    }
  ],
  "location": "Steps.user_enters_Email_as_and_as_password(String,String)"
});
formatter.result({
  "duration": 188255099,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_login()"
});
formatter.result({
  "duration": 5710755600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 61312699,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.Steps.page_title_should_be(Steps.java:137)\r\n\tat ✽.Then page title should be \"Dashboard / nopCommerce administration\"(1Login.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.user_click_on_Logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("2Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Customer",
  "description": "",
  "id": "customer",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email as \"admin@yourstore.com\" and \"admin\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 3037112000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 8095357300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "Steps.user_enters_Email_as_and_as_password(String,String)"
});
formatter.result({
  "duration": 190059599,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_login()"
});
formatter.result({
  "duration": 8224911300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 14049200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Add a new customer",
  "description": "",
  "id": "customer;add-a-new-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks on customers Menu",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "clicks on customers Menu item",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clicks on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user can view Add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters customer info",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "clicks on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User can view confirmation massage \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_customers_Menu()"
});
formatter.result({
  "duration": 3094547200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_customers_Menu_item()"
});
formatter.result({
  "duration": 3752235000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_Add_new_button()"
});
formatter.result({
  "duration": 3732103800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "duration": 5947100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_customer_info()"
});
formatter.result({
  "duration": 6826488100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_Save_button()"
});
formatter.result({
  "duration": 6099139900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 36
    }
  ],
  "location": "Steps.user_can_view_confirmation_massage(String)"
});
formatter.result({
  "duration": 20875600,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]The new customer has...\u003e but was:\u003c[×\n]The new customer has...\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.Steps.user_can_view_confirmation_massage(Steps.java:269)\r\n\tat ✽.Then User can view confirmation massage \"The new customer has been added successfully.\"(2Customers.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.user_close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email as \"admin@yourstore.com\" and \"admin\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 3010767799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 8114135700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "Steps.user_enters_Email_as_and_as_password(String,String)"
});
formatter.result({
  "duration": 179499100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_login()"
});
formatter.result({
  "duration": 7968722200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 11560300,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Search Customer by EmailID",
  "description": "",
  "id": "customer;search-customer-by-emailid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user clicks on customers Menu",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "clicks on customers Menu item",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Enters customer Email",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should found Email in the Search table",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_customers_Menu()"
});
formatter.result({
  "duration": 3083815100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_customers_Menu_item()"
});
formatter.result({
  "duration": 3781192000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enters_customer_Email()"
});
formatter.result({
  "duration": 111510301,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_search_button()"
});
formatter.result({
  "duration": 3021017100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_found_Email_in_the_Search_table()"
});
formatter.result({
  "duration": 579916499,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 606002000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email as \"admin@yourstore.com\" and \"admin\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 3029004500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 8299825400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "Steps.user_enters_Email_as_and_as_password(String,String)"
});
formatter.result({
  "duration": 158429001,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_login()"
});
formatter.result({
  "duration": 7237054200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 9652401,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Search Customer by Name",
  "description": "",
  "id": "customer;search-customer-by-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user clicks on customers Menu",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "clicks on customers Menu item",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Enters customer FirstName",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Enters customer LastName",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "User should found Name in the Search table",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_customers_Menu()"
});
formatter.result({
  "duration": 3079960300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_customers_Menu_item()"
});
formatter.result({
  "duration": 3757774301,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enters_customer_FirstName()"
});
formatter.result({
  "duration": 68315300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enters_customer_LastName()"
});
formatter.result({
  "duration": 69011900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clicks_on_search_button()"
});
formatter.result({
  "duration": 3019527900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_found_Name_in_the_Search_table()"
});
formatter.result({
  "duration": 586145301,
  "error_message": "java.lang.AssertionError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.Steps.user_should_found_Name_in_the_Search_table(Steps.java:325)\r\n\tat ✽.Then User should found Name in the Search table(2Customers.feature:40)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});