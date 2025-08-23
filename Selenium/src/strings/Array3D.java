package strings;

public class Array3D {

	public static void main(String[] args) {
		int[][][] arr= {{{10,20},{30,30}},
						{{10,20,30},{10,20,30},{10,20,30,40}}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
