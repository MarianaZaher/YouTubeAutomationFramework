# YouTube Automation Framework (Cucumber + Selenium + TestNG + Maven)

## Features

- Automates YouTube video search scenarios.
- Uses Page Object Model with PageFactory.
- Data-driven test scenarios via Cucumber Examples.
- Takes screenshot on failure (saved in `screenshots/`).
- Generates reports in HTML and JSON.

## Tools Used

- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven

## How to Run

1. Ensure you have Maven and ChromeDriver set up.
2. Run using:
```
mvn clean test
```
3. View results in `target/cucumber-reports.html`