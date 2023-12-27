package Requests;

import net.datafaker.Faker;

public class OrderRequestBuilder_old {
    static Faker faker;
    static Items[] itemsVal = new Items[1];
    static PurchaseUnits[] purchase_units = new PurchaseUnits[1];
    public static void createOrderRequestBuilder(String intentVal){
        faker = new Faker();
//        Items listOfItem = Items.builder().name(faker.name().toString())
//                .description(faker.dog().toString()).quantity(15)
//                .unit_amount(UnitAmount.builder().value(112).currency_code(faker.currency().toString()).build()).build();
//        itemsVal[0] = listOfItem;
//        PurchaseUnits purchaseItem = PurchaseUnits.builder()
//               .amount(Amount.builder().currency_code(String.valueOf(faker.currency()))
//                       .value(110).breakdown(BreakDown.builder()
//                               .item_total(ItemTotal.builder().currency_code(faker.currency().toString()).value(112).build()).build()).build())
//                .items(itemsVal)
//               .build();
//        purchase_units[0]=purchaseItem;
//        return CreateOrderRequest.builder().intent(intentVal)
//                .purchase_units(purchase_units)
//                .application_context(Application_Context.builder().return_url(faker.fakeValuesService().toString()).cancel_url(faker.fakeValuesService().toString()).build()).build();
    }
}
