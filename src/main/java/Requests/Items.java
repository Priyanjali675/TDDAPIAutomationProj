package Requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder

public class Items {
	private String name;
	private String description;
	private int quantity;
	private UnitAmount unit_amount;

	public Items(String name, String description,int quantity,UnitAmount unitamount) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unit_amount = unitamount;
	}


}
