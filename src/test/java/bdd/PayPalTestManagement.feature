Feature:Paypal Test Management file
Background: Create Authorization code
  Given Authorization code is available to make a request

  @CreateOrder
  Scenario:Complete an Paypal Order and get order details
    Given "OrderCreation" is done for the PayPal Account
    When "GetOrderDetails" is sent with orderId
    Then Response is retrieved with status code "200"

  @UpdateOrder
  Scenario:Update a Paypal Order and get order details
    Given "OrderCreation" is done for the PayPal Account
    When "GetOrderDetails" is sent with orderId
    Then Response is retrieved with status code "200"

 # @AuthorizePaymentOnOrder
 # Scenario:Authorize the payment process for a successful Order
 #   Given Order is successful for "OrderId"
 #   When "GetOrderDetails" is sent with "OrderId"
 #   Then Response is retrieved with status code "200"