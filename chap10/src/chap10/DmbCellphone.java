/**
 * 여러개의 부모클래스 상속 안됨 .extends 위에는 단 하나의 부모 클래스만 
 * private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외 
 */
package chap10;

public class DmbCellphone extends CellPhone {
	
	int channel;
	
	//생성자 
	DmbCellphone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("channel "+channel+" DMB Start receiving Broadcasts");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("channel "+channel+" change");
	}
	void turnOffDmb() {
		System.out.println("DMB off");
	}
}
