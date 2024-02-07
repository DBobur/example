package examples;

import java.util.Scanner;

public class NumberMaxMinHard {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);
    public static void main(String[] args) {

    }
    static void task1(){
        System.out.print("n: ");
        int n= scInt.nextInt();
        int A[]=new int[n];
        for (int i = 0; i < n; i++) {
            int a= scInt.nextInt();
            A[i]=a;
        }
        int maxA,maxsum=0;
        int minA,minsum=0,n1=n;
        System.out.print("(m<n) m: ");
        int m= scInt.nextInt();
        for (int i = 0; i < m; i++) {
            maxA=A[0];
            int index=0;
            for (int j = 0; j < n; j++) {
                if(A[j]>maxA){
                    maxA=A[j]; index=j;
                }
            }
            maxsum+=maxA;
            int c=A[index];
            A[index]=A[n-1];
            A[n-1]=c;
            n--;
        }
        for (int i = 0; i < n1; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            minA=A[0];
            int index=0;
            for (int j = 0; j < n1; j++) {
                if(A[j]<minA){
                    minA=A[j]; index=j;
                }
            }
            minsum+=minA;
            int c=A[index];
            A[index]=A[n1-1];
            A[n1-1]=c;
            n1--;
        }
        System.out.println("MaxSum: "+maxsum+"\nMinSum: "+minsum);
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
