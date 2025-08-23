package OtherPrograms;

public class QuickSort {
	public static void quicksort(int a[],int low,int high) {
		if(low<high) {
			int pindex=partition(a,low,high);
			quicksort(a,low,pindex-1);
			quicksort(a,pindex+1,high);
		}
	}
	public static int partition(int a[],int low,int high) {
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		int t=a[i+1];
		a[i+1]=a[high];
		a[high]=t;
		return i+1;
	}
	public static void main(String[] args) {
		int a[]= {13,5,34,24,21,11,16};
		quicksort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
