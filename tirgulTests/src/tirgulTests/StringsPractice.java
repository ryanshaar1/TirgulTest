package tirgulTests;

public class StringsPractice {
	public static int countStrikes(String str) {
		
		int count = 1;
		for(int i = 0; i<str.length()-1; i++) {
			if(str.charAt(i) != str.charAt(i+1)){
				count++;
			}
		}
		return count;
	}
	
    public static int countOccurrences(String longString, String shortString) {
        int count = 0;
        for(int i =0; i<(longString.length()-shortString.length()); i++) {
            String temp = longString.substring(i, i + shortString.length());
            if(temp.equals(shortString)) {
            	count++;
            }
            
        }
        return count;
    }
	
    public static void main(String[] args) {
    	String str = "aabccccaaacddd";
    	int num = countStrikes(str);
    	System.err.println(num);
}
}