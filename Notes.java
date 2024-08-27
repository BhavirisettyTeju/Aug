package nec.nit.nips;

import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		System.out.println("Enter the Amount :");
		int amt = money.nextInt();
		int notes100=0,notes50=0,notes20=0,notes10=0,notes5=0,notes2=0,notes1=0; 
		if(amt >100) {
			notes100 = amt/100;
			amt = amt-100 * 100;
		}
		if(amt >50) {
			notes50 = amt/50;
			amt = amt- 50 * 50;
		}
		if(amt >20) {
			notes20 = amt/20;
			amt = amt-20 * 20;
		}
		if(amt >10) {
			notes10 = amt/10;
			amt = amt-10 * 10;
		}
		if(amt >5) {
			notes5 = amt/5;
			amt = amt-5 * 5;
		}
		if(amt >2) {
			notes2 = amt /2;
			amt = amt-2 * 2;
		}
		if(amt >1) {
			notes1 = amt;
		}
		System.out.println("100 = "+ 100);
		System.out.println("50 = "+ 50);
		System.out.println("20 = "+ 20);
		System.out.println("10 = "+ 10);
		System.out.println("5 = "+ 5);
		System.out.println("2 = "+ 2);
		System.out.println("1 = "+ 1);
	}
}