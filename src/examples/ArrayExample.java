package examples;

import java.util.Scanner;

public class ArrayExample {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);
    public static void main(String[] args) {
        task4();

    }

    static void task1(){
        System.out.print("n: ");
        int n = scInt.nextInt(), A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"]=");
            int a= scInt.nextInt();
            A[i]  = a;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(A[i]<A[j]){
                    A[i]=A[i]+A[j];
                    A[j]=A[i]-A[j];
                    A[i]=A[i]-A[j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+"  ");
        }
        System.out.println();
        System.out.print("\nSiz qidiryotgan son: ");
        int q_son= scInt.nextInt();
        int begin = 0,end=n-1;
        while (begin<=end){
            int index=(begin+end)/2;
            int natija=A[index];
            if(natija==q_son){
                System.out.println(index+" : "+natija);
                break;
            } else if (natija>q_son) {
                begin=index+1;
            }else {
                end=index-1;
            }
        }
    }
    static void task2() {
        System.out.print("Nechta sonni EKUB qiymati kerak n: ");
        int n = scInt.nextInt(), A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("son " + (i + 1) + ": ");
            int a = scInt.nextInt();
            A[i] = a;
        }
        int EKUB = A[0], oson = 0, B[] = new int[EKUB / 2], m = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] < EKUB)
                EKUB = A[i];
        }
        for (int i = 1; i <= (EKUB / 2) + 1; i++) {
            if (EKUB % i == 0) {
                B[m] = i;
                m++;
            }
        }
        while (oson != n) {
            oson = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] % EKUB == 0) {
                    oson++;
                }
            }
            if (oson != n && m > 0) {
                EKUB = B[(m - 1)];
                m--;
            }
        }
        System.out.println(EKUB);
    }
    static void task3(){
        System.out.print("Nechta sonni EKUK qiymati kerak n: ");/////////////// 2
        int n=scInt.nextInt(),A[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("son "+(i+1)+": ");
            int a= scInt.nextInt(); A[i]=a;
        }
        int EKUK=A[0],oson=0,B[]=new int[EKUK/2],m=0;
        for (int i = 0; i < n; i++) {
            if(A[i]>EKUK)
                EKUK=A[i];
        }
        for (int i = 1; i <= (EKUK/2)+1; i++) {
            if(EKUK%i==0){
                B[m]=i;
                m++;
            }
        }
        while (oson!=n){
            oson=0;
            for (int i = 0; i < n; i++) {
                if(EKUK%A[i]==0 || A[i]%EKUK==0){
                    oson++;
                }
            }
            if(oson!=n && m>0){
                EKUK=B[(m-1)];
                m--;
            }
        }
        System.out.println(EKUK);
    }
    static void task4(){
        int a=scInt.nextInt(),n=(String.valueOf(a).length()),son=0,d=0;
        int A[]=new int[n];
        System.out.print("almashlanuvchi 1-son: ");
        int b=scInt.nextInt();
        System.out.print("almashlanuvchi 2-son: ");
        int c=scInt.nextInt();
        for (int i = 0; i<n; i++) {
            A[i]=a%10;
            a=a/10;
        }
        for (int i = 0; i < n; i++) {
            if(A[i]==b)
                A[i]=c;
            else if(A[i]==c)
                A[i]=b;
        }
        for (int i = 0; i < n; i++) {
            son+=A[i]*Math.pow(10,d);
            d++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println("\n"+son);
    }
}
