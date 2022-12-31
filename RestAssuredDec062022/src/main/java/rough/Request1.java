package rough;

import java.util.HashMap;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Request1 {
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://api.openweathermap.org";
		RequestSpecification spec = RestAssured.given();
		
		Map<String,Object> queryParam=new HashMap<>();
		System.out.println(RestAssured.baseURI);

	}

}
