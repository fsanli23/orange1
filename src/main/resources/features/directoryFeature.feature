Feature: Directory

  @directory
  Scenario Outline: User should see the employees in the directory
    Given User is on the unAuht home page
    Then User login into App "<userName>" and "<password>"
    Then user verifies title of page "<title>"
    Then user click on directory
    Then user searches for employee "<employeeName>" and click on the employee
    Then user verifies that user details is displayed

    Examples:
      | userName | password | title     | employeeName  |
      | Admin    | admin123 | OrangeHRM | Odis  Adalwin |

