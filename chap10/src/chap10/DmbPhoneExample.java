package chap10;

public class DmbPhoneExample {

	public static void main(String[] args) {
		DmbCellphone dmbcellphone = new DmbCellphone("java phone","black",10);
		
		System.out.println("model"+dmbcellphone.model);
		System.out.println("color"+dmbcellphone.color);
		
		System.out.println("channel"+dmbcellphone.channel);
		
		//CellPhone 상속 받은 메소드 호출 
		dmbcellphone.poweron();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("hello");
		dmbcellphone.receiveVoice("hello i'm Lee");
		dmbcellphone.sendVoice("nice to meet you");
		dmbcellphone.hangup();
		
		//DmbCellphone상속 받은 메소드 호출 
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(20);
		dmbcellphone.turnOffDmb();
	}

}
