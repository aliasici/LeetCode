package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};

        System.out.println(containsDup(arr));
    }

    public static boolean containsDup(int[] numbers){
//
//        HashSet<Integer> list = new HashSet<>();
//
//        for(int i = 0; i <= numbers.length-1; i++){
//            if(list.contains(numbers[i])) return true;
//                list.add(numbers[i]);
//
//        }
//        return false;

        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i]) return true;
        }

        return false;

    }

}
