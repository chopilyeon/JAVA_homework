package kr.ac.kopo;

import java.util.Scanner;


public class Homework06{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("시작단을 입력하세요");
        System.out.println("종료단을 입력하세요");


        int start = sc.nextInt();
        int end = sc.nextInt();





        int max=end;
        int min=start;



        if(start>end){
            max = start;
            min= end;
        }



        System.out.printf("***%d단입니다***",min);
        for(int i=1;i<=9;i++){
            System.out.printf("%d*%d=%d",min,i,min*i);
            System.out.println();
        }
        System.out.println();
        System.out.printf("***%d단입니다***",max);
        for(int i=1;i<=9;i++){
            System.out.println();
            System.out.printf("%d*%d=%d",max,i,max*i);
        }







    }
}
