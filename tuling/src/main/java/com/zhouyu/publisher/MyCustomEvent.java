package com.zhouyu.publisher;

import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent {

	public MyCustomEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "MyCustomEvent";
	}
}
