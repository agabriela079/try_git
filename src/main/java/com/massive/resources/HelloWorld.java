package com.massive.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorld {

	@GET
	@Produces("text/plain")
	public String helloWorld() {

		String helloMassive =
			" ,ggg,        gg                                       ,ggg, ,ggg,_,ggg,                                                               \n" +
			"dP\"\"Y8b       88           ,dPYb, ,dPYb,              dP\"\"Y8dP\"\"Y88P\"\"Y8b                                                              \n" +
			"Yb, `88       88           IP'`Yb IP'`Yb              Yb, `88'  `88'  `88                                                              \n" +
			" `\"  88       88           I8  8I I8  8I               `\"  88    88    88                                   gg                         \n" +
			"     88aaaaaaa88           I8  8' I8  8'                   88    88    88                                   \"\"                         \n" +
			"     88\"\"\"\"\"\"\"88   ,ggg,   I8 dP  I8 dP    ,ggggg,         88    88    88    ,gggg,gg    ,g,       ,g,      gg      ggg    gg   ,ggg,  \n" +
			"     88       88  i8\" \"8i  I8dP   I8dP    dP\"  \"Y8ggg      88    88    88   dP\"  \"Y8I   ,8'8,     ,8'8,     88     d8\"Yb   88bgi8\" \"8i \n" +
			"     88       88  I8, ,8I  I8P    I8P    i8'    ,8I        88    88    88  i8'    ,8I  ,8'  Yb   ,8'  Yb    88    dP  I8   8I  I8, ,8I \n" +
			"     88       Y8, `YbadP' ,d8b,_ ,d8b,_ ,d8,   ,d8'        88    88    Y8,,d8,   ,d8b,,8'_   8) ,8'_   8) _,88,_,dP   I8, ,8I  `YbadP' \n" +
			"     88       `Y8888P\"Y8888P'\"Y888P'\"Y88P\"Y8888P\"          88    88    `Y8P\"Y8888P\"`Y8P' \"YY8P8PP' \"YY8P8P8P\"\"Y88\"     \"Y8P\"  888P\"Y888";

		return helloMassive;
	}
}