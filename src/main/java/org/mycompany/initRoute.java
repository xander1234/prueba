package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class initRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		//from("timer://foo?repeatCount=1")
		from("timer://foo?period=1000")
		.setBody(constant("Hola Mundo"))
		.log(">>> ${body}")
		.to("log:OUT-processEmail?showAll=true&multiline=true")
		.end();		
		
	}
	
	

}
