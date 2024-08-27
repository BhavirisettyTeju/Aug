package nec.nit.nips;

public class PatternDots {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	       
	        for (int r=1;r<=6;r++) {
	            
	            for (int c=1;c<=5;c++) {
	               
	                if ((r==1)||(r==6)) {
	                    System.out.print("******");
	                }
	                
	                else {
	                	 if ((c==1)||(c==5)) {
	                	
	                	
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	}

}
}
