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

## Test Case/Scenario 1
1- navigate to https://www.youtube.com/
2- search by 'Selenium Tutorial' Keyword
3- click on filters button
4- click on Video under the Type tab
5- get the title of the third video in results
6- click the third video 
7- assert that the video title in step 5 is the same title in step 6 



## Test Case/Scenario 2
1- Same as test case 1 but change the keyword to 'Test Automation Tutorial'

## Test Case/Scenario 3
1- Same as test case 1 but choose the 10th video in results
