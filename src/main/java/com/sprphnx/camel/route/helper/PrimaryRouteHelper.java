package com.sprphnx.camel.route.helper;

import org.apache.camel.Exchange;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sprphnx.camel.model.FullInformationDto;
import com.sprphnx.camel.model.MinInformationDto;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class PrimaryRouteHelper {

	public void processMinInfo(Exchange exchange) {
		FullInformationDto fullInfo = (FullInformationDto)exchange.getIn().getBody();
		MinInformationDto minInfo = new MinInformationDto();
		BeanUtils.copyProperties(fullInfo, minInfo);
		log.info(minInfo);
	}
	
}
