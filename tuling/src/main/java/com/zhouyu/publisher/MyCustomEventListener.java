package com.zhouyu.publisher;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyCustomEventListener implements ApplicationListener<MyCustomEvent> {

	@Override
	public void onApplicationEvent(MyCustomEvent event) {
		System.out.println("Handling custom event: " + event.toString());

		// 添加事件处理逻辑，例如打印事件信息

		// 在这里可以执行其他自定义的事件处理代码
	}
}
