# ParaBank Selenium Automation Framework

Test automation framework for the ParaBank demo banking application.

## Tech Stack
Java 17, Selenium WebDriver 4, TestNG, Maven, Page Object Model, Eclipse

## Test Scenarios
- New user registration
- Login with invalid credentials (negative)
- Login with valid credentials (positive)
- Fund transfer between accounts

## Features
- Page Object Model design
- Explicit waits
- Config-driven base URL (config.properties)
- Automatic screenshot on test failure

## How to Run
1. Clone the repo
2. Import as Maven project in Eclipse
3. Run `testng.xml` as TestNG Suite (or `mvn clean test`)

## Test Result

![Test Result](docs/test-result.png)