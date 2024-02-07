package examples;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);

        /*
         * N partiya o'ynalgani---N
         * har partiyada M qo'l o'ynalgani---M
         * har qo'lda kim yutgani
         * har partyadagi hisob
         * ofshiy partiyalar bo'yicha xisob
         * va iloji bo'lsa har safar tosh qaychilarni o'rni o'zgarib turad
         * asosiysi ilojini qilib bu o'yinni ham qiziqarliroq qilib
         * yani n ta odam uchun qilaman
         */

        String list[]={"tosh","qaychi","qogoz"};
        System.out.println("========= GAME =========\n");
        System.out.print("🤝necha qo'l o'ynaymiz n: ");
        int n=scInt.nextInt();
        System.out.println("=====================================================================");
        exit:
        while (true) {
            if(n==0) {
                System.out.print("🤝necha qo'l o'ynaymiz n: ");
                n=scInt.nextInt();
                System.out.println("=====================================================================");
            }
            System.out.println("1=>Tosh  2=>Qaychi  3=>Qogoz");
            System.out.println("    1      2      3 ");
            System.out.print("\ntanlang (1/\\2/\\3): ");
            int my = scInt.nextInt();
            int comp = (int)(Math.random() * 3);
            System.out.println("👨siz: " + list[(my - 1)]);
            System.out.println("💻komp: " + list[comp]);
            String myList=list[(my-1)],compList=list[comp];
            String new1="🧑🧑🧑🧑Siz G'olib🧑🧑🧑🧑";
            String new2="💻💻💻💻Komp G'olib💻💻💻💻";
            String new3="💻💻💻💻💻Durrang🧑🧑🧑🧑🧑";
            if(myList=="tosh"){
                if(compList=="tosh"){
                    System.out.println(new3);
                } else if (compList=="qaychi") {
                    System.out.println(new1);
                }else{
                    System.out.println(new2);
                }
            } else if (myList=="qaychi") {
                if(compList=="tosh"){
                    System.out.println(new2);
                } else if (compList=="qaychi") {
                    System.out.println(new3);
                }else{
                    System.out.println(new1);
                }
            }else{
                if(compList=="tosh"){
                    System.out.println(new1);
                } else if (compList=="qaychi") {
                    System.out.println(new2);
                }else{
                    System.out.println(new3);
                }
            }
            int xatolarNumber=0;
            n--;
            while (n==0 && xatolarNumber<5) {
                if(xatolarNumber==0) {
                    System.out.println("=====================================================================");
                }
                System.out.print("\nDavom etamizmi (0/1): ");
                int qayta = scInt.nextInt();
                if (qayta == 0 || xatolarNumber==4) {
                    break exit;
                } else if (qayta == 1) {
                    System.out.println("\nQani kettik bo'lmasa!!!");
                    break;
                } else {
                    System.out.println("Error...???");
                    xatolarNumber++;
                }
            }
        }


    }
}
