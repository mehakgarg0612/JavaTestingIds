package Patterns.NumberPattern;

//public class Pattern35_23 {
//    public static void main(String[] args) {
//        for(int row = 3; row>=1;row--){
//            for(int column=1;column<=row;column++){
//                System.out.print(column);
//            }
//            System.out.println();
//        }
//
//        for(int row = 3;row>=1;row--){
//            for(int column = 3; column>=row;column--){
//                System.out.print(" ");
//            }
//            for(int k = row ; k >= 1 ; k--){
//            System.out.print(k);
//            }
//            System.out.println();
//        }
//
//    }
//}

public class Pattern35_23 {
    public static void main(String[] args) {
        for(int row = 3 ; row >= 1 ; row--){
            for(int column = 1; column<=row ; column++) {
                System.out.print(column);
            }

                for(int columnK = row; columnK < 3; columnK++){
                    System.out.print("**");
                }

                for(int reverse = row ; reverse >= 1 ; reverse--){
                    System.out.print(reverse);
                }
            System.out.println();
            }

        }
    }
