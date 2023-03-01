import ngay5a.Hinhchunhat;
import ngay5a.Hinhhoc;
import ngay5a.Hinhtron;
import ngay5a.Hinhvuong;

public class Main {
    public static void main(String[] args) {
        Hinhhoc[] hinhHocs = new Hinhhoc[3];

        hinhHocs[0] = new Hinhtron(3);
        hinhHocs[1] = new Hinhvuong(4);
        hinhHocs[2] = new Hinhchunhat(5, 6);


        // In ra tat cac hinh
        for (Hinhhoc h : hinhHocs) {
            System.out.println(h);
        }

        // In ra hinh co chu vi lon nhat
        double cvMax = hinhHocs[0].tinhchuvi();
        int vtMax = 0;

        for (int i = 1; i < hinhHocs.length; i++) {
            if (cvMax < hinhHocs[i].tinhchuvi()) {
                cvMax = hinhHocs[i].tinhchuvi();
                vtMax = i;
            }
        }
        System.out.println("Hinh co chu vi lon nhat la : ");
        System.out.println(hinhHocs[vtMax]);
    }
}