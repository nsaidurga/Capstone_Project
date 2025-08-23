package strings;

public class Array2d {

	public static void main(String[] args) {
		int[][] a= {{1,2},
					{4,5,6},
					{8}
				   };//dynamic array beacuse we can add,change etc..
				
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] a1=new int[3][3]; //static array we cant change its size once declared
		//how to initialise it
		int n=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a1[i][j]=n++;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}

}
}