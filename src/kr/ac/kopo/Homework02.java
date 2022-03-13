package kr.ac.kopo;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 100사이의 정수를 입력하시오");
        System.out.print("\n");
        System.out.print("2-10사이의 정수를 입력하시오");
        System.out.print("\n");
        int a = sc.nextInt(); //a는 나누어지는 수
        int b = sc.nextInt(); //b는 나누는 수

        for(int i=1;i<=a;i++){
            if(i%b!=0){
                System.out.print(i);
                System.out.print(" ");
            }
        }

    System.out.println();

        int line=0;
        for (int i = 1; i <= a; i++) {
            if (i % b !=0) {
                System.out.print(i);
                System.out.print(" ");
                line += 1;
            }
            if(line%b==0){
                System.out.print("\n");
            }
        }
    }
}