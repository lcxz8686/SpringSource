package com.zhouyu.publisher;

import com.zhouyu.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EventPublisher eventPublisher = context.getBean("eventPublisher", EventPublisher.class);

		// 发布自定义事件
		eventPublisher.publishCustomEvent();

		context.close();
	}
}