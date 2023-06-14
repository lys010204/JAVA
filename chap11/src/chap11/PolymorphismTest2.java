package chap11;

class Item{
	public int price;
}
class Noodle extends Item{
	public Noodle() {
		price=2500;
	}
	public String toString() { return "국수";}
}
class MixNoodle extends Item{
	public MixNoodle() {
		price=3000;
	}
	public String toString() { return "비빔국수";}
}
class Wodong extends Item{
	public Wodong() {
		price=2500;
	}
	public String toString() { return "우동";}
}
class Buyer {
	private int money;
	public Buyer(int money) {
		this.money=money;
	}
	public void buy(Item it, int count) {
		System.out.println(it + "을 " + count + "개 먹었습니다.");
		money=money-it.price*count;
		System.out.println("현재 남은 돈 : "+money);
	}
}

public class PolymorphismTest2 {

	public static void main(String[] args) {
		Buyer me = new Buyer(20000);
		me.buy((new Wodong()),3);
		me.buy((new Noodle()),2);
		me.buy((new MixNoodle()),2);

	}

}
