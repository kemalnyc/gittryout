Feature: Login page steps

    Scenario: Verify multiple user info login
      Given I navigate to homepage
      When I open "Account" page
      Then I validate following emails and passwords are login in with no issue:
        | username        | password   |
        | kemalnyc@gmail.com | sipyatagi |
        | liz@b.com       | liz.blue$ |
        | jwick@gmail.com | john.wick$ |