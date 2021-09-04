
Feature: Login feature
  Desc

  @login @smoke @reg
  Scenario: verify login with valid credentials

    Given I Open Home Page "http://www.next.co.uk"
    When I Click My account link
    And I Enter username "GeorgeLynn@sample.com" and password "Lynn123@"
    And I Click Sign in button
    Then I should be logged in successfully with message as "Login Successful"
    And I should get re-directed to profile page

  @login @reg
  Scenario: verify login with invalid credentials

    Given I Open Home Page "http://www.next.co.uk"
    When I Click My account link
    And I Enter username "GeorgeLynn123@sample.com" and password "Lynn1253@"
    And I Click Sign in button
    Then I shouldn't allowed be login with message as "Unable to sign you in"

  @login @reg
  Scenario: verify login with forgot Password

    Given I Open Home Page "http://www.next.co.uk"
    When I Click My account link
    And I click forgot password link
    Then I should be displayed with forgot password pop up