package com.example.cxfdemo;

import org.example.hello.HelloPort;







@javax.jws.WebService(
                      serviceName = "CXFHelloExampleService",
                      portName = "CXFHelloExampleService",
                      targetNamespace = "http://cxfdemo.example.com/v1.1",
                      endpointInterface = "com.example.cxfdemo.v1_1.HelloPort")
                      
public class HelloPortImpl implements HelloPort {

	public String sayHelloOperation(String newPart) {
		// TODO Auto-generated method stub
		return null;
	}
   
}	