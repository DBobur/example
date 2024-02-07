package examples;

import java.util.Scanner;

public class Contact {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        System.out.println("===== Contact Gaming =====");
        String[] phone=new String[20];
        String[] sim=new String[20];
        int tugatish[]={1};
        a:
        while(true){
            if(tugatish[0]==0){
                break a;
            }
            System.out.println("0=> Tugatish\n1=> Phone\n2=> Sim");
            System.out.print("Buyuring: ");
            switch (scInt.nextInt()){
                case 0->{break a;}
                case 1->{qoshish(phone,tugatish);}
                case 2->{qoshish(sim,tugatish);}
            }
        }
    }
    public static void qoshish(String[] name,int[] tugatish) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        int i = 0;
        a:
        while (true) {
            System.out.println("0=> Oldinga\n1=> Tugatish\n2=> Create\n3 => Delete\n4=> Kontaktni ko'zdan kechirish!");
            System.out.print("Buyuring: ");
            switch (scInt.nextInt()) {
                case 0 -> {
                    break a;
                }
                case 1 -> {
                    tugatish[0]=0;
                    break a;
                }
                case 2 -> {
                    System.out.print("raqamni kiriting: ");
                    name[i] = scStr.nextLine();
                    System.out.print("raqam egasini kiriting: ");
                    name[i] += "    "+scStr.nextLine();
                    i++;
                    System.out.println("raqam muoffaqqiyatli qo'shildi!");
                }
                case 3 -> {
                    System.out.print("o'chirmoqchi kontaktiz raqamini kiriting: ");
                    String kalit=scStr.nextLine();
                    for (int j = 0; j < i; j++) {
                        if (name[j].indexOf(kalit)>=0) {
                            name[j] = "";
                        } else if (j == i - 1) {
                            System.out.println("bunday raqamli kontakt mavjud emas ..?");
                        }
                    }
                }
                case 4 -> {
                    for (int j = 0; j < i; j++) {
                        System.out.println(name[j]);
                    }
                }
            }
        }
    }
}
