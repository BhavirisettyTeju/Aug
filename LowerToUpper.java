package nec.nit.nips;
public class LowerToUpper {
		public static void main(String[] args) {
			char ch1 = 'A',ch2='a';
			int d = ch1-ch2;
			String str = "HI I AM TEJASWINI";
			char eachChar;
			String newStr = "";
	 		for(int i=0;i<str.length();i++) {

				eachChar = str.charAt(i);
				if( (eachChar >='A') &&(eachChar <='Z')) {
					newStr = newStr + (char)(eachChar - d);
				}
				else {
					newStr = newStr + eachChar;
				}
			}
			System.out.println("final Res---->"+newStr);
			}	
	}
