package Rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SingleEmployeeResource {

    @Test
    public void callSingleEmployeeResources() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bf3bb2fc21350f886bf09").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void callSingleEmployee() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bf3bb2fc21350f886bf09").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void postInfo() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();//json.simple.JSONObject
        jsonObject.put("empName", "Hasanul");
        jsonObject.put("empEmail", "hasanul@gmail.com");
        jsonObject.put("department", "QA");
        request.body(jsonObject.toJSONString());
        Response response = request.post("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources");
        System.out.println(jsonObject);
    }
    @Test
    public void updateInfo(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("empName", "Karim");
        jsonObject.put("empEmail", "karim@gmail.com");
        jsonObject.put("department", "Dev");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bf3bb2fc21350f886bf09");
        System.out.println(jsonObject);
    }
    @Test
    public void getInfo() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bf3bb2fc21350f886bf09").then().statusCode(200).extract().response();
    }
    @Test
    public void deleteInfo() {
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bf3bb2fc21350f886bf09");
        boolean actual = response.equals(null);
        boolean expected = Boolean.parseBoolean(null);
        Assert.assertEquals(actual, expected);
    }
}