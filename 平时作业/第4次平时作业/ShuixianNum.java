package homework;

public class ShuixianNum {

	public static void main(String[] args) {
		int m = 1; 
		for(int i = 100; i < 1000; i++) {
			int a, b, c;
			a = i / 100;
			b = (i / 10) % 10; 
			c = i % 10; 
			if((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i) {
				System.out.println("ShuiXianHua No" + m + ":" + i);
				m++; 
			}
		}
	}
}
