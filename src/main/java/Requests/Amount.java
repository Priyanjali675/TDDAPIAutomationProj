package Requests;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Amount {
	private String currency_code;
	private double value;
	private BreakDown breakdown;
	
}
