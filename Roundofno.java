package nec.nit.nips;

import java.util.Scanner;

public class Roundofno {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter float value");
			float num = sc.nextFloat();
			int m = (int)(num * 100000);
			int ld = m % 10;
			m = m /10;
			if(ld > 5) m++;
			num = m/100.0f;
			
			System.out.println("res---->"+num);
}
}