Feature: validate user login 
Scenario Outline: check for valid and invalid credentials
Given login page should be open
When click on login enter <username1> and <password1>
And click the signin button check <status>
Then login successfulll
Examples:
|username1|password1|status|
|877676|password|fail|
|username|ndg46|fail|
|hdjs354|ggswhs67|fail|
|username|password|success|