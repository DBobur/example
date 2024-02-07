package examples;

import java.util.Scanner;

public class StrNumber {
    static Scanner scInt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n: ");
        int n= scInt.nextInt();
        int A[]=new int[String.valueOf(n).length()];
        int C[]=new int[2*String.valueOf(n).length()];
        String A1[]={"bir","ikki","uch","to'rt","besh","olti","yetti","sakkiz","to'qqiz"};
        String B[]={"o'n","yigirma","o'ttiz","qirq","ellik","oltmish","yetmish","sakson","to'qson","yuz","ming","million"};
        String B1[]=new String[2*String.valueOf(n).length()];
        int str=0,i1=0,cc=0;
        do{
            A[i1]=(n/(int)(Math.pow(10,String.valueOf(n).length()-1)))*(int)(Math.pow(10,String.valueOf(n).length()-1));
            i1++;
            n=n%(int)(Math.pow(10,String.valueOf(n).length()-1));
        }while(n>0);
        for (int i = 0; i < i1; i++) {
            System.out.print(A[i]+"  ");
        }
        for (int i = 0; i < i1; i++) {
            if(A[i]>=10000 && A[i]<1000000){
                C[cc]=A[i]/1000; cc++;
            } else if (A[i]>=10000000 && A[i]<1000000000) {
                C[cc]=A[i]/1000000; cc++;
            } else {
                C[cc]=A[i]; cc++;
            }
        }
        System.out.println();
        for (int i = 0; i < cc; i++) {
            int nol=String.valueOf(C[i]).length()-1;
            int son=C[i]/(int)(Math.pow(10,nol));
            if(String.valueOf(C[i]).length()==2){
                switch (C[i]){
                    case 10: { B1[str]=B[0]; str++; } break;
                    case 20: { B1[str]=B[1]; str++; } break;
                    case 30: { B1[str]=B[2]; str++; } break;
                    case 40: { B1[str]=B[3]; str++; } break;
                    case 50: { B1[str]=B[4]; str++; } break;
                    case 60: { B1[str]=B[5]; str++; } break;
                    case 70: { B1[str]=B[6]; str++; } break;
                    case 80: { B1[str]=B[7]; str++; } break;
                    case 90: { B1[str]=B[8]; str++; } break;
                }
            } else{
                switch (son){
                    case 1: {B1[str]=A1[0]; str++;} break;
                    case 2: {B1[str]=A1[1]; str++; } break;
                    case 3: {B1[str]=A1[2]; str++; } break;
                    case 4: {B1[str]=A1[3]; str++; } break;
                    case 5: {B1[str]=A1[4]; str++; } break;
                    case 6: {B1[str]=A1[5]; str++; } break;
                    case 7: {B1[str]=A1[6]; str++; } break;
                    case 8: {B1[str]=A1[7]; str++; } break;
                    case 9: {B1[str]=A1[8]; str++; } break;
                }
                if(nol>0)
                    switch (nol){
                        case 2: { B1[str]=B[9]; str++; } break;
                        case 3: { B1[str]=B[10]; str++; } break;
                        case 6: { B1[str]=B[11]; str++; } break;
                    }
            }
        }
        for (int i = 0; i < str; i++) {
            System.out.print(B1[i]+" ");
        }
    }
}
