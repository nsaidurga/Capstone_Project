package OtherPrograms;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a= {6,4,5,1,3,2};
		int n=6;
		for(int i=1;i<6;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
