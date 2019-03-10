public class HocSinh {
     String ten;
    int tuoi;
     boolean gioitinh;
     String diachi;
     float diem;
     String lop;
  /**initial information for student;
   *
   *
   *
   * */
    void nhap(String ten,int tuoi,boolean gioitinh,String diachi,float diem,String lop){
  ;
  this.ten =ten;
        this.tuoi =tuoi;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
        this.diem=diem;
        this.lop=lop;


    }
    void inThongTin(){
        System.out.println("Ho Ten:"+ten);
        System.out.println("Dia Chi"+diachi);
        System.out.println("Tuoi"+tuoi);
        System.out.println("Gioi tinh"+(gioitinh ? "Nam" : "Nu"));
        System.out.println("Diem"+diem);
        System.out.println("Lop"+lop);
    }
    void hoc(){
        System.out.println();
    }

    void hocbai()  {

    }

}
