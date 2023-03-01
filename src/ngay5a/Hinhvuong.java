package ngay5a;

public class Hinhvuong implements Hinhhoc {
    private double canh;

    public Hinhvuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhchuvi() {
        return canh * 4;
    }

    @Override
    public double tinhdientich() {
        return canh *  canh;
    }

    @Override
    public String toString() {
        return "Hinhvuong{" +
                "canh=" + canh +
                '}';
    }
}

