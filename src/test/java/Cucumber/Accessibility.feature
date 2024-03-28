

Feature: Accessibility Testing
 
  @Accessibility
  Scenario Outline: Test Accessibility for multiple links
    Given Open <link>
    #When Run Accessibility Test for Perceivable for <linkName>
    And Run Accessibility Test for Operable
    Then Close Browser

    Examples: 
      | link 										 | linkName |
      | https://www.heart.org/   | Home		 |
      #| https://www.heart.org/en/volunteer/opportunities 		|  volunteer-opportunities      | 
