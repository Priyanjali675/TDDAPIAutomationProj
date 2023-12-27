package Requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnitAmount {
	private String currency_code;
	private double value;

    public UnitAmount() {

    }
}
