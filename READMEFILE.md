VoltUlautomationFramework : -- 
-----------------------------------

Automated UI test suite for Volt Money Mutual Fund Loan Eligibility page (https://voltmoney.in/check-loan-eligibility-against-mutual-funds)
---------------------------------------------------------------


VoltUlautomationFramework/
├── pom.xml
├── Testng.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/utility/FactoryofDrivers.java
│   └── test/
│       └── java/tests/
│           ├── Checkeligibilityin15sscreentest.java
│           ├── Contactuspagetest.java
│           ├── Contactuspom.java
│           └── Eligibilitypage.java
├── test-output/


Tech Stack:-- 
------------------
Java 11+
Selenium WebDriver
TestNG
Maven



Setup & Run Instructions : -- 
------------------------------------------------
Prerequisites: Java 11+, Maven, Chrome browser installed.
Clone the repository.
In the project root, run:

mvn clean install
mvn clean test -DsuiteXmlFile=Testng.xml

OR, right-click Testng.xml in your IDE and select "Run".

Test results will be in the test-output directory.

