package Requests;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Application_Context {
	private String return_url;
	private String cancel_url;
}
