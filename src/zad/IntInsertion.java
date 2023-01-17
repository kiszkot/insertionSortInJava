package zad;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class IntInsertion {
	
	public static int[] sortInt(int[] arr) {
		int len = arr.length;
		for(int i=1; i<len; i++) {
			for(int j=i;j>0 && arr[j-1]>arr[j]; j--) {
				int tmp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=tmp;
			}
		}
		return arr;
	}
	
	public static void show(int arr[]) {
		int len = arr.length;
		for(int i = 0; i<len; i++) {
			StdOut.printf("%d\n", arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] array = StdIn.readAllInts();
		int sorted[] = sortInt(array);
		show(sorted);
	}

}
