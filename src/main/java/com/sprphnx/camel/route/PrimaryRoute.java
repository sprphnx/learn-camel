package com.sprphnx.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sprphnx.camel.route.helper.PrimaryRouteHelper;


@Component
public class PrimaryRoute extends RouteBuilder{
	
	@Autowired
	PrimaryRouteHelper helper;

	@Override
	public void configure() throws Exception {
		
		from("direct:primary").routeId("primary-route")
							  .log("TESTING THE ROUTE")
							  .split(body())
							  .parallelProcessing()
							  .process(helper::processMinInfo);
	}

}
