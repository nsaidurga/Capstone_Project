package strings;

public class ArraySum {

	public static void main(String[] args) {
		int[][] s=new int[4][2];
		
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				s[i][j]=s[i][j]+s[i][j];
			}
		}
		
		
	}

}
