package ngay5a;

public class Hinhchunhat implements Hinhhoc {
    private double chieudai;
    private double chieurong;

    public Hinhchunhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public double tinhchuvi() {
        return (chieudai + chieurong) * 2;
    }

    @Override
    public double tinhdientich() {
        return chieudai * chieurong;
    }

    @Override
    public String toString() {
        return "Hinhchunhat{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }
}
