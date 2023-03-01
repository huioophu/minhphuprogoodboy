package bai2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanvien nv1 = new KyThuat("so 1","Bui Minh Phu","28/01/1999","Hung Yen","Dien tu");
        System.out.println("Nhap ma nhan vien:");
        String mnv = sc.nextLine();
        System.out.println("Nhap ho va ten:");
        String ht = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        String ns = sc.nextLine();
        System.out.println("Nhap dia chi:");
        String dc = sc.nextLine();
        System.out.println("Nhap chuyen nganh:");
        String cn = sc.nextLine();
        sc.close();
        nhanvien nv2 = new KyThuat(mnv,ht,ns,dc,cn);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}

