package com.webservices;


import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.webservices.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

   @Override
   public String getHelloWorldAsString(String name) {
       return "Hello "+name+" from a JAX-WS ";
   }

}
