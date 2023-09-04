Feature: Search and place the order for the product
  @OffersPage
  Scenario Outline: Search Experience for the prduct search in both Home and Offer Page 
  
  Given User is on GreenCart landing page
  When User searched with shortname <Name> and Extracted actual productname 
  Then User searched for <Name> shortname in offers page 
  #Then Validate product name in offers page matches with landing page
  
  Examples:
  | Name |
  | Tom  |
  | Beet |
  | Cucu |