package DoitAlgorithm.chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c){
        if(a>=b){
            if(b>=c){
                return b;
            }else if(a<=c) {
                return a;
            }else{
                return c;
            }
        }else if (a>c){
            return a;
        }else if(b>c){
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세수의 중앙값");
        System.out.println("int a");
        int a = sc.nextInt();
        System.out.println("int b");
        int b = sc.nextInt();
        System.out.println("int c");
        int c = sc.nextInt();

        System.out.println("중앙값은"+med3(a,b,c));

    }
}
