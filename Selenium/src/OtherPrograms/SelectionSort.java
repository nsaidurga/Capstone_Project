package OtherPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {82,12,3,34,23,63};
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
