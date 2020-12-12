package algorithme3;

public class solution {

	public static void main(String[] args) {
		
		int [] A= {1,5,2,-2};

		int [ ] c = new int [4];
		c=method(A);
		for(int j=0 ;j<c.length;j++)
			
		{
			System.out.println(method(A)[j]);
		}


			}

	
	
	static void Sort(int[] tab) {
		int taille = tab.length;
		int tmp = 0;
		for (int i = 0; i < taille; i++) {
			for (int j = 1; j < (taille - i); j++) {
				if (tab[j - 1] > tab[j]) {
					tmp = tab[j - 1];
					tab[j - 1] = tab[j];
					tab[j] = tmp;
				}

			}
		}
	}

	public static int[] method(int[] A) {
		Sort(A);
		int[] S = new int[A.length];
		int min = 0;
		if (A[0] - A[1] < A[0] + A[1]) {
			S[0] = -1;
			S[1] = 1;
			min = S[0] - S[1];
		}
		if (A[0] - A[1] > A[0] + A[1]) {
			S[0] = 1;
			S[1] = 1;
			min = S[0] + S[1];
		}
		for (int i = 2; i < A.length; i++) {
			if (min - A[i] < min + A[i]) {
				S[i] = -1;
				min = Math.abs(min - A[i]);
			}
			if (min - A[i] > min + A[i]) {
				S[i] = 1;
				min = Math.abs(min + A[i]);
			}
			if (min - A[i] == min + A[i]) {
				S[i] = 1;
				min = Math.abs(min + A[i]);
			}

		}

		return S;
	}

}
