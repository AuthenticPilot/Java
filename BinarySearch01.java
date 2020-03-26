package Toour;
import java.util.*;
public class BinarySearch01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("\n Enter the length of the array:");
	    int len = sc.nextInt();
	    int[] arr = new int[len];
	    System.out.println("Enter the elements of the array:\n");
	    for (int i = 0; i < len; i++) {
	      arr[i] = sc.nextInt();
	    }
	    System.out.println("Enter the elements you want to search:\n");
	    int data = sc.nextInt();
	    int ust = len - 1, alt = 0;
	    int loc = BinarySearch(arr, alt, ust, data);
	    if (loc >= 0)
	      System.out.println("Target value is at index: " + loc);
	    else
	      System.out.println("Target value not found");
		
		
	}
	
	public static int BinarySearch(int[] arr, int alt, int ust, int data) {
		int ort = (alt + ust) / 2;
	    int loc = -1;
	    while ((alt <= ust) && (arr[ort] != data)) {
	      if (data < arr[ort])
	        ust = ort - 1;
	      else
	        alt = ort + 1;
	      ort = (alt + ust) / 2;
	      if (data == arr[ort]) {
	        loc = ort;
	        break;
	      } 
	      else
	        loc = -1;
	    }
	    ;
	    return loc;
	  }

}
