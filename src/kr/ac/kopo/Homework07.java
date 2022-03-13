package kr.ac.kopo;

public class Homework07 {

    public static void main(String[] args){




    for(int i=2;i<=9;i++){
        for(int j=1;j<=9;j++) {
            if (i % 3 == 2 & i != 8) {
                System.out.printf("%d*%d=%d %d*%d=%d %d*%d=%d \n", i, j, i * j, i + 1, j, (i + 1) * j, i + 2, j, (i + 2) * j);
            }
            if (i == 8) {
                System.out.printf("%d*%d=%d %d*%d=%d \n", i, j, i * j, i + 1, j, (i + 1) * j);
            }
        }
            if(i%3==1){
                System.out.print("\n");
            }


        }



    }

}