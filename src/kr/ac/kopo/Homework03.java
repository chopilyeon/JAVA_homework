package kr.ac.kopo;
import java.util.Scanner;

public class Homework03{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("속도를 입력하시오");


        int distance = 0;
        int velopcity = 5;



        int hour=0;
        while (distance < 120) {
            if (distance < 50) {
                int bar1 = 1;
                hour+=1;
                distance = (velopcity-bar1)*hour;
                System.out.printf("[%d시간 후 달팽이가 올라간 높이는 %d입니다]",hour,distance);
                System.out.println();
            } else if(distance>50){
                int bar2=2;
                hour+=1;
                distance = (velopcity-bar2)*hour;
                System.out.printf("[%d시간 후 달팽이가 올라간 시간은 %d입니다]",hour,distance);
                System.out.println();
            }
        }

    }
}