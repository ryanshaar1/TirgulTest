package tirgulTests;
import java.util.*;
public class MissingNum {
	public static Scanner reader = new Scanner(System.in);
	
	
	public static int missingNum (int[] arr) {

		int hefresh1 = 0;
		int hefresh2 = 0;
		int hefresh3 = 0;
		int finalHefresh = 0;
		hefresh1 = arr[arr.length-1] -arr[arr.length-2];
		hefresh2 = arr[arr.length-2] -arr[arr.length-3];
		hefresh2 = arr[arr.length-3] -arr[arr.length-4];
		if(hefresh1 == hefresh2)
			finalHefresh = hefresh1;
		else if(hefresh2 == hefresh3)
			finalHefresh = hefresh2;
		else
			finalHefresh = hefresh3;
		for(int i =0; i<arr.length; i++) {
			if(arr[arr.length-i-1] -arr[arr.length-i-2] != finalHefresh) {
				return arr[arr.length-i-1]-finalHefresh;
			}
		}
		return 0;
	}

	
	
	
	public static void main(String[] args) {
		int[] arr = {6,8,12,14,16,18};
		int result = missingNum(arr);
		System.out.println(result);
	}

}
