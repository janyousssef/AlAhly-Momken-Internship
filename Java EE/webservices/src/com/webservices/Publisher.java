package com.webservices;

import javax.xml.ws.Endpoint;
import com.webservices.*;

//Endpoint publisher
public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9091/", new HelloWorldImpl());

	}

}
