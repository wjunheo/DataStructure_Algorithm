package DoitAlgorithm.chap01;

import java.util.Scanner;

public class Max03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세정수의 최댓값");
        System.out.println("a값");
        int a = sc.nextInt();
        System.out.println("b값");
        int b = sc.nextInt();
        System.out.println("c값");
        int c = sc.nextInt();

        int max = a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("최댓값은"+max+"입니다");
    }
}
