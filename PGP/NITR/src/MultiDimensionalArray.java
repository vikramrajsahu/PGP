
public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/* iterate array in a matrix form */
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n[i].length;j++)
			{
				System.out.print(n[i][j]+"    ");
			}//for
			System.out.println();
		}//for
	}
}
