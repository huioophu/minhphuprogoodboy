package bai2;

public class KyThuat extends nhanvien {
    public String chuyenNganh;


    public KyThuat(String manv, String hoten, String namsinh, String diaChi, String chuyennganh) {
        super(manv, hoten, namsinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "nhanVien{" +
                "maNhanVien='" + super.getManv() + '\'' +
                ", hoTen='" + super.getHoten() + '\'' +
                ", namSinh='" + super.getNamsinh() + '\'' +
                ", diaChi='" + super.getDiachi() + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';


    }

}
