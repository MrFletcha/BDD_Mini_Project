Feature: I want to be able to begin the checkout process after adding an item to my basket

  Scenario: Begin checkout process
    Given I have clicked add to cart
#    When I click proceed to checkout from home
#   needs to change to the above to avoid duplication issue (JF)
    When I click proceed to checkout
    Then The order summary page appears