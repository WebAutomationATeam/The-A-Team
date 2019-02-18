package rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleEmployeeAPI {

    @Test
    public void callSingleEmployeeAnimeshRahmanPartha() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4951522fc21350f886baf2").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        System.out.println(body);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void callSingleEmployeeRohanRahman() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590a4ada35522970c7956ce2").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        String header = response.getHeader("Content-Type");
        System.out.println(header);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
        //System.out.println(response);
    }
    @Test
    public void postInfoHasib() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();//json.simple.JSONObject
        jsonObject.put("empName", "Lazim");
        jsonObject.put("empEmail", "hasib@gmail.com");
        jsonObject.put("department", "QA");
        request.body(jsonObject.toJSONString());
        Response response = request.post("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources");
        System.out.println(jsonObject);
    }
    @Test
    public void updateInfoHasib(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("empName", "Lazim");
        jsonObject.put("empEmail", "hasib@gmail.com");
        jsonObject.put("department", "Qqqqq");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c49757d2fc21350f886bbcc");
        System.out.println(jsonObject);
    }
    @Test
    public void getInfoHasib() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c49682f2fc21350f886bb5b").then().statusCode(200).extract().response();
    }
    @Test
    public void deleteInfoHasib1() {
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c49675a2fc21350f886bb56");
        boolean actual = response.equals(null);
        boolean expected = Boolean.parseBoolean(null);
        Assert.assertEquals(actual, expected);
    }
}