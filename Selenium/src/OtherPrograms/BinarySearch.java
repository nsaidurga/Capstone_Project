package OtherPrograms;

import java.util.Arrays;

public class BinarySearch {
	public static int binary(int a[],int target) {
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {23,12,34,35,13,43};
		Arrays.sort(a);
		int target=12;
		int i=binary(a,12);
		if(i!=-1) {
			System.out.println(target+" found at "+i);
		}
	}

}
