package ReusableMethods;

import io.restassured.path.json.JsonPath;
public class GenericUtils {
		public static String extractValueFromResponse(String Response, String key) {
			JsonPath js1  = new JsonPath(Response);
			return js1.getString(key);
		}
}
