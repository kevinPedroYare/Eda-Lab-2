public class Ejercicio_02{
    private static int d=2;
    public static void main (String [] args){
        int A []= {1,2,3,4,5};
        rotarArray(A);
    }
        public static int [] rotarArray(int [] A){
            
        for (int i = 0; i < A.length-1; i++) {
            A[i] = A[i+1];
        }
        A[A.length-1] = d;
        return A;
        }
    

}
