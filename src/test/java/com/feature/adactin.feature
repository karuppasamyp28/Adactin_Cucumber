Feature: Hotel Booking In Adaction Application

Scenario: Login Functionality
Given user Launches The Application
When user Enters The Username In Usernamefield
And user Enters The Password In Passwordfield
Then user clicks The Login Button And It Navigates To The Search Hotel Page
 
 Scenario: Search Hotel Functionality
 When user Select The Location In Loacation Field 
 And user Select The Hotels In Select Hotel Field
 And user Select The Roomtype In Select Roomtype Field
 And user Enters The Number Of Rooms 
 And user Select The CheckInDate
 And user Select The CheckOutDate
 And user Enters Adults Per Room
 And user Enters Child Per Room
 Then user Clicks The Search Button And It Navigates To Next Page
 
Scenario: Select Hotel Functionality
Given user Selects The Radiobutton
Then user Clicks To Continue

Scenario: Hotel Booking Functionality
Given user Enters Firstname In Required Field
Then user Enters Lastname In Required Field
And user Enters Address In Required Field
And user Enters Card Number In Required Field
And user Selects Card Type
And user selects Card Expire Month
And user Selects Card Expire Year
And user Enters Cvv Number In Required Field
And user Clicks The Book Now Button
Then user Takes Screenshot

Scenario: Logout Functionality
Given user Clicks Logout Button


