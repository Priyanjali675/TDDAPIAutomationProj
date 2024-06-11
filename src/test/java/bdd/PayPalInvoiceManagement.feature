Feature: Invoice creation, update, cancel and delete
  Background: Create Authorization code
    Given Authorization code is available to make a request
     And Generate Invoice Number
  Scenario: Create a Draft Invoice Number
  Given Invoice Number is available
    When Invoice draft is submitted with body and "InvoiceNumber"
    Then Verify the "status" is "201"
    And Verify the "invoiceNumber" is "InvoiceNumber"
