package p124;

public class DowhileSample {
	public static void main(String[] args) {
		char c ='a';
		
		do {
			System.out.print(c);
			c = (char) (c+1);
		} while(c<='z');
	}
}
