package bai2;

public abstract class nhanvien {
    private String manv;
    private String hoten;
    private String namsinh;
    private String diachi;
    public nhanvien() {
    }

    public nhanvien(String manv, String hoten, String namsinh, String diachi) {
        this.manv = manv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public String getManv() {
        return manv;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public   String motacongviec;

    @Override
    public String toString() {
        return "nhanvien{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", namsinh='" + namsinh + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}

