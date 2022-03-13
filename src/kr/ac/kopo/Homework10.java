package kr.ac.kopo;

public class Homework10 {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            if(i<=5){
                for(int j=1;j<=9;j++){
                    if(j<=i|j>=10-i){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }else{
                for(int j=1;j<=9;j++){
                    if(j<=10-i|j>=i){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }
                System.out.println();

            }

        }

}
