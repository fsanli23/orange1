Feature: User Login Experience E2E

  @Login1
  Scenario Outline: User should be able log in from unauth home page

    Given User is on the unAuht home page
    Then User login into App "<userName>" and "<password>"
    Then user verifies title of page "<title>"
    Examples:
      | userName | password | title     |
      | Admin    | admin123 | OrangeHRM |