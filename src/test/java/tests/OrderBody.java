package tests;

public class OrderBody {


		public static String updatedOrderBody() {
			return "[\r\n"
					+ "    {\r\n"
					+ "        \"op\": \"add\",\r\n"
					+ "        \"path\": \"/purchase_units/@reference_id=='default'/shipping/address\",\r\n"
					+ "        \"value\": {\r\n"
					+ "            \"address_line_1\": \"123 Townsend St\",\r\n"
					+ "            \"address_line_2\": \"Floor 6\",\r\n"
					+ "            \"admin_area_2\": \"San Francisco\",\r\n"
					+ "            \"admin_area_1\": \"CA\",\r\n"
					+ "            \"postal_code\": \"94107\",\r\n"
					+ "            \"country_code\": \"US\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "        \"op\": \"add\",\r\n"
					+ "        \"path\": \"/purchase_units/@reference_id=='default'/invoice_id\",\r\n"
					+ "        \"value\": \"03012022-3303-01\"\r\n"
					+ "    }\r\n"
					+ "]";
		}
}
