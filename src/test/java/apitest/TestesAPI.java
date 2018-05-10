package apitest;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;

public class TestesAPI {
	
	public TestesAPI() {
		baseURI = "https://postman-echo.com/post";
	}
	
	@Test
    /*Chama o serviço pelo metodo POST*/
    public void testCriaUsuario() {
        String myJson = "{\"Teste\"}";
         
         given()
           .contentType("application/json")
           .body(myJson)
         .when()
           .post("/")
         .then()
           .statusCode(200);    
    }

}
