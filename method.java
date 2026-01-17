package New;

class Computer{
	public void playMusic() {
		System.out.println("Playing Music");
	}
	public String getMePen() {
		return "Pen";
	}
	public String checkValue(int cost) {
		if(cost >= 10) 
			return "New Pen";
		return "Nothing";	
	}
}

public class method {

	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.playMusic();
		String str = obj.getMePen();
//		String str1 = obj.checkValue(2);
		String str1 = obj.checkValue(12);
		System.out.println(str1);

	}

}
