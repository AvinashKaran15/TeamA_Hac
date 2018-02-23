package com.hackathon.hw.apitest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class getRequestsvalidation {
	
	public void getRequestt1()
	{
		Response res = RestAssured.given().when().get("");
		int code = res.getStatusCode();
		Assert.assertTrue(code==200);;
	}
	
	public void getRequestt2()
	{
		Response res = RestAssured.given().when().get("");
		int code = res.getStatusCode();
		Assert.assertTrue(code==201);;
	}

}
