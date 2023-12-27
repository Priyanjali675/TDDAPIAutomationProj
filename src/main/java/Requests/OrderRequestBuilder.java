package Requests;



public class OrderRequestBuilder {
    static Items[] itemsVal = new Items[1];
    static PurchaseUnits[] purchase_units = new PurchaseUnits[1];
    public static CreateOrderRequest createOrderRequestBuilder(String intentVal){

        UnitAmount unit_amount = new UnitAmount();
        unit_amount.setValue(100.00);
        unit_amount.setCurrency_code("USD");
        Items listOfItem = new Items("Purchase order Creation","Test",1,unit_amount);
        itemsVal[0] = listOfItem;
        PurchaseUnits purchaseItem1 =  PurchaseUnits.builder()
               .amount(Amount.builder().currency_code("USD")
                       .value(100.00).breakdown(BreakDown.builder()
                               .item_total(ItemTotal.builder().currency_code("USD").value(100.00).build()).build()).build())
                .items(itemsVal)
               .build();
        purchase_units[0]=purchaseItem1;
        return CreateOrderRequest.builder().intent(intentVal)
                .purchase_units(purchase_units)
                .application_context(Application_Context.builder().return_url("https://www.google.com").cancel_url("https://www.google.com").build()).build();
    }
}
//