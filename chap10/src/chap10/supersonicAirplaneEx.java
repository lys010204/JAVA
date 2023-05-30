package chap10;

public class supersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane s = new SupersonicAirplane();
		
		s.takeoff();
		s.fly();
		s.land();
		
		s.flyMode = SupersonicAirplane.SUPERSONIC;
		s.fly();
		s.flyMode = SupersonicAirplane.NOMAL; 
		s.fly();
		s.land();

	}

}
