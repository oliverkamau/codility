import java.util.Arrays;

public class RotationCodility {

    public static int[] rotateArray(int[] A, int k){



        if(k>0 && A.length > 0){

            for(int i = 0; i < k; i++){
                int[] B = new int[A.length];

                for (int j = 0; j < A.length; j++) {

                    B[j] = A[j];
                }
//                System.out.println("A "+Arrays.toString(A));
//                System.out.println("B "+Arrays.toString(B));
                A = new int[B.length];
                A[0] = B[B.length - 1];
//                System.out.println("A "+Arrays.toString(A));
//                System.out.println("B "+Arrays.toString(B));
                for(int l = 0; l < B.length-1; l++){

                    try {
                        A[l+1] = B[l];
                    }catch(Exception e){
                        System.out.println("Out of bounds");
                    }


                }
//                System.out.println("A "+Arrays.toString(A));
//                System.out.println("B "+Arrays.toString(B));
            }
        }
        return A;
    }

    public static void main(String[] args){

        int[] sampleArray = {};
//        {4,1,2,3} {3,4,1,2} {2,3,4,1}
        int k = 3;
        rotateArray(sampleArray, k);
        System.out.println(Arrays.toString(rotateArray(sampleArray,k)));

    }
}
