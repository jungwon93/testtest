package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("LG tv--전원 켠다");
	}
	
	public void powerOff() {
		System.out.println("LG tv--전원 끈다");
	}
	
	public void volumeUp() {
		System.out.println("LG tv--소리 올린다");
	}
	
	public void volumeDown() {
		System.out.println("LG tv--소리 내린다");
	}
}
