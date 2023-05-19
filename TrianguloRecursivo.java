public class TrianguloRecursivo{

	public static void main(String[] args){
	
		trianguloRecursivo(5);
		trianguloRecursivo(6);
		trianguloRecursivo(10);
		trianguloRecursivo(3);
	}

	public static void trianguloRecursivo(int base){

		int a = 1;
		int b = base - 1;

		for(int i=0;i<=base;i++){
			
			for (int j = 1; j < a; j++) {
				System.out.print("*");
			}

			for (int j = 1; j < b; j++) {
				System.out.print(" ");
			}
	
			System.out.println();
			a++;
			b--;
		}
	}
}
