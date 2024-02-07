package examples;

import java.util.Scanner;

public class XOGame {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);
        System.out.print("===== [X/0] Game =====\nn: ");
        int n=scInt.nextInt(),a=1;
        int A[][]=new int[n][n];
        char A1[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j]=a;
                a++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A1[i][j]='-';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-1){
                    System.out.print("\t|\t"+A[i][j]+"\t|\t");
                }else {
                    System.out.print("\t|\t" + A[i][j]);
                }
            }
            System.out.println();
        }
        int a1=0;
        char gamerOne='X',gamerTwo='0';
        a2:
        while(a1<n*n){
            System.out.print("[X] FirstGamer=> n: ");
            int a3=scInt.nextInt();
            qaytar(A,n,a3,A1,gamerOne);
            a1++;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(A1[i][i]==A1[i][j] && j==n-1 && A1[i][i]!='-'){
                        System.out.println(A1[i][i]+" ga'alaba qildi!");
                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < n; l++) {
                                if(k==i){
                                    System.out.print("😎"+"\t\t");
                                }else {
                                    System.out.print("--"+"\t\t");
                                }
                            }
                            System.out.println();
                        }//ship batl
                        break a2;
                    }else if(A1[i][i]!=A1[i][j]){
                        break;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if(A1[0][i]==A1[j][i] && j==n-1 && A1[0][i]!='-'){
                        System.out.println(A1[i][i]+" ga'alaba qildi!");
                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < n; l++) {
                                if(l==i){
                                    System.out.print("😎"+"\t\t");
                                }else {
                                    System.out.print("--"+"\t\t");
                                }
                            }
                            System.out.println();
                        }
                        break a2;
                    }else if(A1[0][i]!=A1[j][i]){
                        break;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if(A1[0][0]==A1[j][j] && j==n-1 && A1[i][i]!='-'){
                        System.out.println(A1[0][0]+" ga'alaba qildi!");
                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < n; l++) {
                                if(k==l){
                                    System.out.print("😎"+"\t\t");
                                }else {
                                    System.out.print("--"+"\t\t");
                                }
                            }
                            System.out.println();
                        }
                        break a2;
                    }else if(A1[0][0]!=A1[j][j]){
                        break;
                    }
                }
                int m=n-1;
                for (int j = 0; j < n; j++) {
                    if(A1[0][m]==A1[j][m-j] && j==m && A1[0][m]!='-'){
                        System.out.println(A1[0][m]+" ga'alaba qildi!");
                        int ll=n-1;
                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < n; l++) {
                                if(l==ll){
                                    System.out.print("😎"+"\t\t");
                                }else {
                                    System.out.print("--"+"\t\t");
                                }
                            }ll--;
                            System.out.println();
                        }
                        break a2;
                    }else if(A1[0][m]!=A1[j][m-j]){
                        break;
                    }
                }
            }
            if(a1==n*n){
                break;
            }
            System.out.print("[0] SecondGamer=> n: ");
            int a4=scInt.nextInt();
            qaytar(A,n,a4,A1,gamerTwo);
            a1++;
        }
    }
    public static void qaytar(int A[][],int n,int qiymat,char A1[][],char oyinchi){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(A[i][j]==qiymat){
                    A1[i][j]=oyinchi;
                }
                if(j==n-1){
                    if(A1[i][j]=='-') {
                        System.out.print("\t|\t" + (A[i][j]) + "\t|\t");
                    }else{
                        System.out.print("\t|\t"+(A1[i][j])+"\t|\t");
                    }
                } else if (A1[i][j]=='-') {
                    System.out.print("\t|\t"+A[i][j]);
                }else {
                    System.out.print("\t|\t"+A1[i][j]);
                }
            }
            System.out.println();
        }
    }
}
