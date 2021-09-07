package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		// 1. Spring 설정 파일을 로딩하여 IoC 컨테이너를 구동한다.
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");	
		
		// 2. Singleton
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
		
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		// 스프링 파일 설정에 "tv"로 <BEAN> 등록된 객체 생성  
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
//		
//		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}
}
