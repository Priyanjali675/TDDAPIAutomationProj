package Requests;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateOrderRequest {
	private String intent;
	private PurchaseUnits []purchase_units;
	private Application_Context application_context;
}
