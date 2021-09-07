package polymorphism;

public class SamsungTV implements TV{
	
	//private SonySpeaker speaker;
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("按眉 檬扁拳 累诀贸府..");
	}
	
	public void destroyMethod() {
		System.out.println("按眉 昏力 傈俊 贸府且 肺流 贸府..");
	}
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 按眉 积己");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 龋免");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 龋免");
		this.price = price;
	}
	
//	public SamsungTV(SonySpeaker speaker) {
//		System.out.println("===> SamsungTV(2) 按眉 积己");
//		this.speaker = speaker;
//	}

	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 按眉 积己");
		this.speaker = speaker;
	}
	
//	public SamsungTV(SonySpeaker speaker, int price) {
//		System.out.println("===> SamsungTV(3) 按眉 积己");
//		this.speaker = speaker;
//		this.price = price;
//	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 按眉 积己");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("伙己 tv--傈盔 囊促 (啊拜 : " + price + ")");
	}
	
	public void powerOff() {
		System.out.println("伙己 tv--傈盔 馋促");
	}
	
//	public void volumeUp() {
//		System.out.println("伙己 tv--家府 棵赴促");
//	}
//	
//	public void volumeDown() {
//		System.out.println("伙己 tv--家府 郴赴促");
//	}
	
//	public void volumeUp() {
//		speaker = new SonySpeaker();
//		speaker.volumeUp();
//	}
//	
//	public void volumeDown() {
//		speaker = new SonySpeaker();
//		speaker.volumeDown();
//	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
