package moiz;

public class testdemo  {
	 
    public static void main(String[] args) {
 
            String hex = "A5";
            int decimal = parseHex(hex);
            System.out.printf("\nA5 Hex to decimal= %d ", decimal);
            
            hex = "FAA";
            decimal = parseHex(hex);
            System.out.printf("\nFAA Hex to decimal= %d ", decimal);
            
            hex = "T\0";
            decimal = parseHex(hex);
            System.out.printf("\nT\\0 Hex to decimal= %d ", decimal);
            
            hex = "ABC";
            decimal = parseHex(hex);
            System.out.printf("\nABC Hex to decimal= %d ", decimal);
            
            hex = "\0A";
            decimal = parseHex(hex);
            System.out.printf("\n\\0A Hex to decimal= %d ", decimal);
        }

    public static boolean convertHextoDec(char a) {
    	String hexCode = "0123456789ABCDEF";
    	int i=0;
    	for(;i<hexCode.length();i++) {
    		if(a==hexCode.charAt(i))
    			break;
    	}
    	if(i<hexCode.length())
    		return true;
    	else 
    		return false;
    }
    private static int parseHex(String hexStr) {
    	try {
	    	for(int i=0;i<hexStr.length();i++) {
	    		char ch=hexStr.charAt(i);
	    		if(!convertHextoDec(ch)) {
	    			throw new NumberFormatException();
	    		}
	    	}
    	}
    	catch(NumberFormatException e){
    		System.out.print("\nCannot Convert.Output 0");
    		return 0;
    	}
        return Integer.parseInt(hexStr, 16);
    }
}