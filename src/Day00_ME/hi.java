package Day00_ME;

import Resourses.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

class Main {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                int num = scan.nextInt();
                if (num < 0) {
                        System.out.println("Negative small");
                }else if (num > 1000000){
                        System.out.println("Positive large");
                }else if (num == 0) {
                        System.out.println("zero");
                } else if (num > 0 && num <1000000){
                                System.out.println("Positive");
                        }else {
                                System.out.println("negative");
                        }





        }
}




