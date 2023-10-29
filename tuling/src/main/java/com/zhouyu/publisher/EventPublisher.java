package com.zhouyu.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

// 事件发布器
@Component
class EventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher eventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.eventPublisher = publisher;
	}

	public void publishCustomEvent() {
		// 创建并发布自定义事件
		MyCustomEvent event = new MyCustomEvent(this);
		eventPublisher.publishEvent(event);
	}
}
