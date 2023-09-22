Feature: Login

  Scenario: Login Successful
    Given he user is on the website
    When he user enter the credentials
      | email            | password |
      | julian@gmail.com | 12345678 |

    Then he user will be logged in
