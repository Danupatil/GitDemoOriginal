Feature: Signing up to portal

  Scenario Outline: Portal Signup with appropriate details
    Given User land on portal homepage
    When User want to register and clicked on register link
    Then User add <FullName> and <Email> and <Password>
    And User click on signup

    Examples: 
      | FullName   |             Email         | Password  |
      | Danushri   |     danupatil70@gmail.com | success   |
      | meenuertzeearrwwass   |     awwdrrarrgashghgewerwerhwu@gmail.com | password   |
      
      
      

