package com.csg.tau.TestProject.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredTest {
	 @Test
	 public void GetBooksDetails() { 
	 	// Specify the base URL to the RESTful web service 
	 	RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
	 	// Get the RequestSpecification of the request to be sent to the server. 
	 	RequestSpecification httpRequest = RestAssured.given(); 
	 	// specify the method type (GET) and the parameters if any. 
	 	//In this case the request does not take any parameters 
	 	Response response = httpRequest.request(Method.GET, "");
	 	// Print the status and message body of the response received from the server 
	 	int code=response.getStatusCode();	
	 	Assert.assertEquals(200, code, "Validating status code");
	 	
	 	String ct=response.header("Content-Type");
	 	Assert.assertEquals("application/json; charset=utf-8", ct, "header value is");
	 	
	 	String body=response.getBody().asString();
	 	Assert.assertEquals(body.contains("toyshop"), true, "body contains toyshop");
	 	
	 	
	 	
	 	
	 	
	     	
	 }

}
