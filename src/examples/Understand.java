package examples;

import java.util.Scanner;

public class Understand {
    public static void main(String[] args) {

    }
    static void task1(){
        System.out.print("Kambinatsiya soni: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Extimoliy eng katta kambinatoriya: ");
        int n1=sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*n1);
        }
        int a1[]=new int[6];
        System.out.print("Shu kombinantga tiking: ");
        for (int i = 0; i < 6; i++) {
            int n3=(int)(Math.random()*n);
            a1[i]=a[n3];
            a[n3]=a[n-1];
            n--;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(a1[i]+"  ");
        }
        System.exit(5);
    }
}
