package nec.nit.nips;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int r=1,v=1;r<=5;r++) { 
			for(int c=1;c<=r;c++) {
				System.out.print(v++ % 2+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
