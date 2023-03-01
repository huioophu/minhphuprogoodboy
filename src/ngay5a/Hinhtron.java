package ngay5a;
import java.nio.channels.Pipe;
public class Hinhtron implements Hinhhoc{
    private double banKinh;

    public Hinhtron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhchuvi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public double tinhdientich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }


    }



