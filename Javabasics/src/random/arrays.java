package random;

public class arrays {
	public static void main(String[]args) {
		int [][] arr = new int[2][3];
		/*arr[0][0]=1;
		arr[0][1]=1;
		arr[0][2]=1;
		arr[1][0]=2;
		arr[1][1]=2;
		arr[1][2]=2;*/
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=2;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
