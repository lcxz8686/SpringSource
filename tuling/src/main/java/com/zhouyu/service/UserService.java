package com.zhouyu.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class UserService {

	private OrderService orderService;

//	public UserService() {
//		System.out.println("1");
//	}

	public UserService(OrderService orderService) {
  		this.orderService = orderService;
		System.out.println("2");
	}


//	public UserService(OrderService orderService1, OrderService orderService2) {
//		System.out.println("3");
//	}

//	public void test(){
//		System.out.println(orderService);
//	}
}