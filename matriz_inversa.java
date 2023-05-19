public class matriz_inversa{
	public static void main(String [] args){
		System.out.println("Array normal:");
		int [] A = new int[]{5, 4 ,3 ,2 ,1};
		imprimir(A);
		System.out.println("Array Invertido:");
		int [] Ain = invertirArray(A);
		imprimir(Ain);
	}
	public static int[] invertirArray(int[] A){
		int [] Ain = new int[A.length];
		int aux, count = 0;
		for (int i = A.length; i > 0; i--){
			aux = A[i-1];
			Ain[count] = aux;
			count++;
		}
		return Ain;
	}
	static void imprimir(int[] a){
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
} 
