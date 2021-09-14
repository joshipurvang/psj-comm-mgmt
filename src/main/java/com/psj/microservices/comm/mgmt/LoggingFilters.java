package com.psj.microservices.comm.mgmt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;



import reactor.core.publisher.Mono;

@Component
public class LoggingFilters implements GlobalFilter {

	private Logger logger = LoggerFactory.getLogger(LoggingFilters.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("Path of the received  ->{}",exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
