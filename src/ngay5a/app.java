package ngay5a;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
    }
    Scanner in = new Scanner(System.in);


    do{
        System.out.println("1. Them Hinh Hoc");
        System.out.println("2. In ra tat ca cac hinh");
        System.out.println("3. In ra hinh co dien tich lon nhat");
        System.out.println("4. In ra hinh co dien tich be nhat");
        System.out.println("5. Sap xep theo thu tu giam dan");
        System.out.println("6. Exit");

        System.out.println("Nhap lua chon:");
        int option = Integer.parseInt(in.nextLine());
        if (option < 0 || option > 5) {
            System.out.println("Lua chon khong hop le");
            continue;
        }
        switch (option){
            case 1:
                System.out.println("\tNhap hinh nao?");
                System.out.println("1. Hinh tron");
                System.out.println("1. Hinh vuong");
                System.out.println("1. Hinh chu nhat");

        }



        while (true);
    }
}
