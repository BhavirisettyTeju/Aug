package nec.nit.nips;

public class DuplicateCounting {
			public static void main(String[] args) {
				String str = "19122284000555"; //489  //0125
				
				int[] count = {
							   0,0,0,0,0,
							   0,0,0,0,0
						      };
								char ch;
				for(int i=0;i<str.length();i++) {
					ch = str.charAt(i);
					count[ch-48]++;
				}

				for(int c=0;c<10;c++) {
					if(count[c] > 1)
					System.out.println(c+"--->"+count[c]);
				}


			}
}
