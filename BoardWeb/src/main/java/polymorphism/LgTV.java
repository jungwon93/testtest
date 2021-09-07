package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}
	
	public void powerOn() {
		System.out.println("LG tv--���� �Ҵ�");
	}
	
	public void powerOff() {
		System.out.println("LG tv--���� ����");
	}
	
	public void volumeUp() {
		System.out.println("LG tv--�Ҹ� �ø���");
	}
	
	public void volumeDown() {
		System.out.println("LG tv--�Ҹ� ������");
	}
}
