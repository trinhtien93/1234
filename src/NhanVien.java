public class NhanVien extends ConNguoi{
    String ten;
    int tuoi;
    String diachi;
    int luong;
    boolean gioitinh;
    String chucvu;


    void nhap(String ten,int tuoi,String diachi,int luong,boolean gioitinh,String chucvu){
        this.ten=ten;
        this.tuoi=tuoi;
        this.diachi= diachi;
        this.luong=luong;
        this.gioitinh=gioitinh;
    }

void inThongTin(){
    System.out.println("Ten:"+ten);
    System.out.println("Tuoi:"+tuoi);
    System.out.println("Diachi"+diachi);
    System.out.println("Luong"+luong);
    System.out.println("Gioitinh"+gioitinh);
}

}