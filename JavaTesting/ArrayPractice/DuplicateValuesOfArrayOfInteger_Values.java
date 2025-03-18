package ArrayPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesOfArrayOfInteger_Values {
    public static void main(String[] args) {

        // by Brute force
        int[] arr = {12,3,4,3,5,6,5};
        for(int i = 0 ; i <arr.length-1 ; i++){
            for(int j = i+1; j <arr.length ; j++){
                if(arr[i] == arr[j] && i!=j){
                    System.out.println(arr[j] + " ");
                }
            }
        }

        // by using set interface
        System.out.println("Output by using set method");

        Set <Integer> s = new HashSet<>();
        for(int num : arr)
        {
            if(s.add(num) == false){
                System.out.println(num);
            }
        }

    }
}
