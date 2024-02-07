package examples;

import java.util.Scanner;

public class BirthWeek {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("yilni kiriting: ");/////////////// 15
        int yil=scInt.nextInt(),oy,kun,qq=2;
        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    qq=1;
                }else qq=2;
            }else qq=1;
        }else qq=2;
        System.out.print("oyni kiriting: ");
        oy=scInt.nextInt();
        System.out.print("kunni kiritng: ");
        kun=scInt.nextInt();
        switch (oy){
            case 12: kun+=0;//dekabir
            case 11: if(oy!=11) kun+=30;//noyabir
            case 10: if(oy!=10) kun+=31;//oktabir
            case 9: if(oy!=9) kun+=30;//sentabir
            case 8: if(oy!=8) kun+=31;//avgust
            case 7: if(oy!=7) kun+=31;//iyul
            case 6: if(oy!=6) kun+=30;//iyun
            case 5: if(oy!=5) kun+=31;//may
            case 4: if(oy!=4) kun+=30;//aprel
            case 3: if(oy!=3) kun+=31;//mart
            case 2: if(oy!=2) kun+=30-qq;//fevral
            case 1: if(oy!=1) kun+=31;//yanvar
        }
        System.out.print("Aynan o'sha kuni: ");
        switch (kun%7){
            case 1:
                System.out.println("Shanba"); break;
            case 2:
                System.out.println("Yakshanba"); break;
            case 3:
                System.out.println("Dushanba"); break;
            case 4:
                System.out.println("Seshanba"); break;
            case 5:
                System.out.println("Chorshanba"); break;
            case 6:
                System.out.println("Payshanba"); break;
            case 0:
                System.out.println("Juma"); break;
        }
    }
}
