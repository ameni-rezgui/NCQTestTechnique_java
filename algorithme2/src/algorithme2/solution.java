package algorithme2;

public class solution {

	public static void main(String[] args) {


		int [] A= {4,4,5,5,1};
		int [] B= {3,2,4,3,1};

		for(int j=0 ;j<method2(A,B).length;j++)
			
		{
			System.out.println(method2(A,B)[j]);
		}
			}
	
	public static int method1(int x)
	{
		int[] T = new int[x];
		
		T[0] = 1;
		T[1] = 1;
		for (int i =2; i < x ; i++) {
			T[i] = T[i-1] + T[i-2];
		
		}

		return T[x-1] ;
	}
	public static int[] method2(int[] A, int[] B) {
	
		int[] compteur = new int[A.length];
		for(int i =0 ;i<A.length;i++)
		{
			compteur[i]= method1(A[i]+1)%(2* method1(B[i]+1));
		}

		return compteur;
	}

}
