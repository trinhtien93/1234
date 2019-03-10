public class ConNguoi {
    String ten;
    int tuoi;
    boolean gioitinh;
    String diachi;


    void nhap(String ten,int tuoi,boolean gioitinh,String daichi){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioitinh=gioitinh;
        this.diachi=diachi;


    }
    void inThongTin(){
        System.out.println("Ten:"+ten);
        System.out.println("Tuoi:+tuoi");
        System.out.println("Gioitinh:"+(gioitinh ? "Nam" :"Nu"));
        System.out.println("Diachi:"+diachi);
    }
}
