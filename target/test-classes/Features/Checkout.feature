Feature: place the order for the product
@PlaceOrder
Scenario Outline: Search Experience for the prduct search in both Home and Offer Page 
  
Given User is on GreenCart landing page
When User searched with shortname <Name> and Extracted actual productname 
And Added 3 Items of selected product to Cart
Then User proceed to Chekcout and Validate the <Name> items in Chekcout Page
And verify user has ability to enter promo code and place the order
  
Examples:
  | Name |
  | Tom  |
  
  