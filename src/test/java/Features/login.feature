Feature: Validate Login
 Scenario Outline: Validate Login
 
 Given: User is on Homepage Portal 
 When User clicks on Login button and enter login details <Email> and <Password>
 And User click on login
  
 Examples: 
 |         Email       |Password|
 |danupatil70@gmail.com|success |
 |danupatil7@gmail.com |sucess |
