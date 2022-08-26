Feature: Place an order with items 


@Check
Scenario Outline: Checkout order with items


Given User is on Greenkart page
When User orders <name> vegetables with mentioned <quantity>
And user proceeds to checkout

Examples:
| name| quantity|
| tomato| 4|
|cucumber| 8|
