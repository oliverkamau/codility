import java.util.*;

public class BinarySearch {
    public static int solution(int N) {
//        100101100
        String numberTest = convertBinary(N);
        int zeroCount = 0;
        int valueCount = 0;
        List<Integer> counts = new ArrayList<>();
        for(int i = 1; i<numberTest.length(); i++){

            if(numberTest.charAt(i)=='0'){
                try {
                    if (numberTest.charAt(i + 1) == '1' && numberTest.charAt(i)=='0') {
                        zeroCount = zeroCount + 1;
                        valueCount = valueCount+1;
                        counts.add(valueCount);
                        valueCount = 0;
                    }
                    else if(numberTest.charAt(i + 1) == '0'){
                        valueCount = valueCount+1;
                    }
                }catch (Exception e){
                     System.out.println("String out of range");
                }
            }
        }
        System.out.println(valueCount);
          System.out.println(counts);
        if(counts.isEmpty()){
            return 0;
        }else{
            Collections.sort(counts);
            return counts.get(counts.size()-1);
        }



    }

    public static String convertBinary(int number){

        String numberString = "";
        while(number != 0){
            if((number & 1) == 1){
                numberString = "1" + numberString;
            }else{
                numberString = "0" + numberString;
            }
            number = number >> 1;
        }
         System.out.println(numberString);
        return numberString;
    }

    public static void main(String[] args) {
        System.out.println(solution(400));
    }

}
