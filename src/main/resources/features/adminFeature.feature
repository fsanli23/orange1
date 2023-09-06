Feature: admin functionality

  @wip
  Scenario Outline:user should be able to add and delete admin
    Given User is on the unAuht home page
    Then User login into App "<userName>" and "<password>"
    Then user verifies title of page "<title>"
    Then User click on the admin on the left bar
    And User click all the check boxes

    Examples:
      | userName | password | title     |
      | Admin    | admin123 | OrangeHRM |

