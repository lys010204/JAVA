package chap10;

public class CellPhone {
	String model;
	String color;
	
	//메소드 
	void poweron() {
		System.out.print("power on");
	}
	void poweroff() {
		System.out.print("power off");
	}
	void bell() {
		System.out.print("ring bell");
	}
	void sendVoice(String message) {
		System.out.println("me: "+message);
	}
	void receiveVoice(String message) {
		System.out.println("you: "+message);
	}
	void hangup() {
		System.out.println("end call");
	}
}
