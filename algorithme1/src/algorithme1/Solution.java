package algorithme1;

public class Solution {

	public int[] T ;

	public static void main(String[] args) {

		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		
		int [] Coupteur = new int[5];
		Coupteur =method(5, A);

		for (int i = 0; i<Coupteur.length ; i++) {
			System.out.println(Coupteur[i]);

		}
	}
	
	public static int[] method(int n,int[] T)
	{
		int[] compteur = new int[n];

		int max_compteur = 0;
		for (int i = 0; i < T.length; i++)

		{

			if (T[i] == n + 1) {
				for (int k = 0; k < n; k++)
					compteur[k] = max_compteur;
			       }

			if ((T[i] <= i) && (T[i] >= 1)) {
				compteur[T[i] - 1] += 1;
				if (compteur[T[i] - 1] > max_compteur)
					max_compteur = compteur[T[i] - 1];
			}

		}

		return compteur;
	}

}
