package recursion;

import java.util.Scanner;

public class recursion {
	public static int idx = 0;

	static void comp(int arr[], int len,int idx) {
		
		if (idx == len-1) {System.out.println(arr[idx]+" equals "+arr[len-idx-1]);
		} else {
			comp(arr,len,++idx);
			
			System.out.println(arr[idx]+" equals "+arr[len-idx-1]);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), arr[] = new int[99];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		comp(arr, num,idx);
		sc.close();
	}
}
