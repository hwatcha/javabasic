package simple;

public class T {
	public static void main(String args[]) {
		A a = new simple.A();
		a.showMsg();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print("*1");
			}else {
				System.out.print("2-");
			}
		}
	}
}
