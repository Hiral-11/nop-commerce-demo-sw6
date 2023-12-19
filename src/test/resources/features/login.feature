Feature: Login Test
  As user I want to login into nop commerce website

@author-HK @smoke
  Scenario: User should navigate to log in page successfully
    Given I am on home page
    When  I click on login link
    Then  I should navigate to log in page successfully

@author-HK @sanity
   Scenario Outline: verify the error message with invalid credentials
    Given I am on home page
    When  I click on login link
    And   I enter invalid email "<email>"
    And   I enter invalid password "<password>"
    And   I click on login button
    Then  I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | nop@gmail.com      | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

    @author-HK @regression
     Scenario: User should login successfully with valid credentials
       Given I am on home page
       When  I click on login link
       And   I enter valid email "Sunmoon@gmail.com"
       And   I enter valid password "MoonSun@123"
       And   I enter on login button
       Then  I should login successfully

     @Author-HK @regression
     Scenario: verify that user should log out successfully
       Given I am on home page
       When  I click on login link
       And   I enter valid email "Sunmoon@gmail.com"
       And   I enter valid password "MoonSun@123"
       And   I enter on login button
       And   I should login successfully
       And   I click on logOut link
       Then  I should be able to see log in link


