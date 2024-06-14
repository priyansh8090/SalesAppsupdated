

Feature: Login funtionality
	
	

  @login
  Scenario: Verify The Login Functionality with Valid Credentials
     Given User Navigate to the Application
     When User Enter the "<Email Address>"
     When User enter the "<Password>"
     And  user click on the Login Button
     And  Otp screen should open
     And Enter otp from email 
     And  user click Submit
    Then User should be able to login 
    And Home Page should be shown
    
   Examples:
   
   |Email Address|Password|

   |Priyansh.Jauhari@innoage.in|Rishu|
    
