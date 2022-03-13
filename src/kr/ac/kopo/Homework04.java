package kr.ac.kopo;
import java.util.Scanner;


public class Homework04 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("2-9단을 입력하세요.");

        int num=sc.nextInt();
            System.out.println("----6단입니다----");

        for(int i=1;i<=9;i++){
            System.out.println();
            System.out.printf("%d*%d=%d입니다",num,i,num*i);

        }


    }
}
