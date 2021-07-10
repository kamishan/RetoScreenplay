Feature: Practice Form
  As a web user
  I want to practice filling out a form
  to practice the automation

@smokeTest
Scenario: Fill out a practice form
  Given that a web user wants to practice automating the filling of a registration form in demoqa
  When he fills in the fields of a practice form
  Then he should see his data in a pop-up window

@smokeTest
Scenario: Fill out a practice form with Excel sheet
  Given that a web user wants to practice automating the filling of a registration form in demoqa
  When he fills in the fields of a practice form with data in an Excel sheet
  Then he should see his data in a pop-up window

@smokeTest
Scenario: Fill out a practice form with properties file
  Given that a web user wants to practice automating the filling of a registration form in demoqa
  When he fills in the fields of a practice form with data in an properties file
  Then he should see his data in a pop-up window