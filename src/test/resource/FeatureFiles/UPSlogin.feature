@UPSlogin @Functional
Feature: As user I want to login in ups  
Scenario Outline: As user I should able to sign in  


 Given Browse to ups homepage
 When Navigate to Sign in page
 And Put valid username in "<UserName>" 
 And valid password in "<Password>"
 Then Navigate login button
 And redirected to  account 
 
 Examples: 

		|UserName |
		|Ravinder24@gmail.com|
		|Password|
		| Ravi_0524|
		 	  
