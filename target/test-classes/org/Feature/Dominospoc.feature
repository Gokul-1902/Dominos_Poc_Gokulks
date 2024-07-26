

   Feature: Food order from Dominos
    
    @sc1
    
 Scenario: Order food
 
     Given the user launch Dominos url
     When  the user click order online now button Naviates The user to location page
     And user enter the adress and Pin code in Loaction Field
     And the user click VEG PIZZA in the top of the margin menu
     And user Have to click the Margherita pizza add to card 
     And user Have to I want to add extra cheese Page
     And user Have to click the Margherita pizza Two Qty
     And user Have to click the Peppy Paneer pizza add to card
     And user Have to click the Peppy Paneer pizza Two Qty
     And the user click BEVERAGES in the top of the margin menu
     And user Have to click the Pepsi 475ml add to card
     And user have to click thePepsi 475ml twelve Qty
     When the user remove  one qty Margherita from the cart
     And the user remove six qty Pepsi 475ml from the cart
     And the user verify the cart click the checkout button
     And the user view the place order page
     Then the user verify the address and price details click place order button
     
     
     
