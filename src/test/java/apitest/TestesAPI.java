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
    public void testImprimiJson() {
        String myJson = "{\"Teste\"}";
         /*Dado uma URL (o método Given entende que a URL a ser chamada
          *  é à definida no construtor da classe) passando no body um JSON
          */
         given()
           .contentType("application/json")
           .body(myJson)
           //quando (when) for por meio do método POST,
         .when()
           .post("/")
           //o resultado esperado é que o status de retorno seja igual a 200
         .then()
           .statusCode(200);    
    }
	
	@Test
	/*Chama o serviço pelo método GET*/
	public void testRequisicaoGet() {
		/*Dado uma URL, quando a requisição for feita usando o 
		 * tipo GET, passando o parâmetro 1
		 */
		given()
		.when()
			.get("/123")
		.then()
			.statusCode(200);
	}

}
