
Feature: Online Shopping and Checkout
As a Customer 
I want to buy a product
So that I can experience a succesful checkout process

Scenario Outline: Customer purches a product and completes checkout succesfully
  Given I am on the homepage
  When Verify that homepage is visible
  When I add products to the cart
  And I click the Cart button
  And Verify Cart Page is Displayed
  And I click Proceed To Checkout
  And I am Taking data from excel "<SheetName>" and <RowNumber>
  And I click Register / Login button
  Then I enter name
  And I enter email 
  And I click signup button
  And I click Title of name
  And I fill password
  And I select date of birth
  And I fill first name
  And I fill last name
  And I fill company name
  And I fill address1
  And I fill address2
  And I select country name
  And I fill state name
  And I fill city name
  And I fill zipcode
  And I fill mobile number
  Then I click create account button
  Then I verify ACCOUNT CREATED! message
  Then I click the continue button
  Then the username is displayed as "Logged in as David"
  Then I click the cart menu
  Then I click Proceed to Checkout of cart page
  Then the delivery address is displayed
  Then the cart information is displayed
  Then I enter description "Thank you for the great service!" in comment text area and click Place Order
  Then I enter Name on Card
  Then I enter card number
  Then I enter CVC number
  Then I enter expiration "12" and "25"
  Then I click pay and confirm order
  And  Verify order confirmation
  
  
  Examples:
  |SheetName | RowNumber |
  |automation |  0      |