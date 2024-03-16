package tirgulTests;
import java.util.*;
public class orginaizedPositiveArr {
	public static Scanner reader = new Scanner(System.in);
	
	public static boolean posOrder(int[] arr) {
		int highestPos = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>0) {
				if(arr[i]>highestPos) {
					highestPos = arr[i];
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {-23, 8, 9, 10, 0};
		boolean bool = posOrder(arr);
		System.out.println(bool);
	}

}
