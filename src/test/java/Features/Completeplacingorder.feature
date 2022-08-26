Feature: Place an order with accepting agreement 

@Checkout
Scenario: Complete order flow

Given User is on Greenkart page
When User orders "Tomato" vegetables with "6"
When User orders "Brinjal" vegetables with "2"
When User orders "Beetroot" vegetables with "4"
And user proceeds to checkout
Then user clicks place order and selects country "India" and terms of conditions and clicks Proceed
And user verifies if the order placed and returns to homepage
