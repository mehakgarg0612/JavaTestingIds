package Arrays;// package JavaFolder.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        int[] ages = {9,3,4,4,2,1,4}; 
        System.out.println(ages[0]);

        int ages2[] = new int[3];
        ages2[0] = 9;
        ages2[1] = 8;
        ages2[2] = 18;
        //ages2[4] = 18;
        System.out.println(ages2[0]);
        System.out.println(ages2[1]);
        System.out.println(ages2[2]);
        System.out.println(ages2.length); // length

        // 2d array

        int[] [] multiarray = new int [3][4]; // 3 row 4 column
        int [] [] multiarray2 = {{2,3},{2,4},{5,4}};
        System.out.println(multiarray2[0][0]);
        multiarray2[0][0] = 9;

        // traverse through array
        // for loop , each loop , while loop

        int[] numbers = {12,3,4,45,45,34,23};
        // for loop 
        for(int i = 0 ; i <numbers.length ; i++){
            System.out.println("Total number in array are : " + numbers[i]);
           // System.out.println("Total number in array are : " + numbers);
           // System.out.println("Total number in array are : " + i);
          //  System.out.println("Total number in array are : " + i[numbers]);
        }  
        
        // for eachloop
        
        for(int result : numbers){
            System.out.println("Result through for each loop : " + result);

        }

        // while loop

        int i = 0;
        while(i < numbers.length){
            System.out.println("Result through while loop : " + numbers[i]);
            i = i+1;
        }

        // traverse through multidimensional array

        int [][] number = {{1,2,4},{2,3}};
        for(int x = 0 ; x < number.length ; x++){
            for(int j = 0 ; j < number[x].length ; j++){
                System.out.println(number[x][j]);
            }
        }



    }
       
}


















