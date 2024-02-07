package examples;

import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);
        char A3[]={'+','-','*','/','%'};
        a:
        while(true) {
            System.out.print("0=> gameOver\t\t1=> easySection\n2=> middleSection\t\t3=> difficultSection\ntanlang: ");
            int a1 = scInt.nextInt(), ball = 0;
            switch (a1) {
                case 0 -> {
                    break a;
                }
                case 1 -> {
                    tanlabBer(A3, 1, 2, 5);
                }
                case 2 -> {
                    tanlabBer(A3, 2, 3, 6);
                }
                case 3 -> {
                    tanlabBer(A3, 3, 4, 7);
                }
            }
        }
    }
    public static void tanlabBer(char[] amallar,int daraja,int amalNumbers,int misollarNumbers) {
        Scanner scInt=new Scanner(System.in);
        int ball=0;
        daraja+=2;
        for (int k = 0; k < misollarNumbers; k++) {
            int A[] = new int[daraja];
            for (int i = 0; i < daraja; i++) {
                int son = (int) (Math.random() * 30);
                A[i] = son;
            }
            float natja = A[0];
            int  n = 0;
            char amallarr[] = new char[daraja - 1];
            for (int i = 0; i < daraja-1; i++) {
                int taxminiy = (int) (Math.random() * amalNumbers);
                char amal = amallar[taxminiy];
                amallarr[n] = amal;
                n++;
            }
            for (int i = 1; i < daraja; i++) {
                switch (amallarr[i-1]) {
                    case '+' -> {
                        natja += A[i];
                    }
                    case '-' -> {
                        natja -= A[i];
                    }
                    case '*' -> {
                        natja *= A[i];
                    }
                    case '/' -> {
                        natja /= A[i];
                    }
                    case '%' -> {
                        natja %= A[i];
                    }
                }
            }
            System.out.print("["+A[0] + "");
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(")" + amallarr[j] + "" + (A[(j + 1)]) + "=");
                } else
                    System.out.print(")" + amallarr[j] + "" + (A[(j + 1)]));
            }
            float javob = scInt.nextInt();
            if (natja == javob) {
                System.out.println("to'g'ri ..!");
                ball += 100 / misollarNumbers;
            } else {
                System.out.println("Noto'g'ri ..?");
                System.out.println("to'g'ri javob: " + natja);
            }
        }
        System.out.println("Toplangan ball: "+ball);
    }
}
