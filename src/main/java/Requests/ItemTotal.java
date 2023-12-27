package Requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Builder
@Setter
public class ItemTotal {
	private String currency_code;
	private double value;


	
}
