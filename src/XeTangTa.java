public class XeTangTa extends Dan {
    int soDan;
    int Somang;

    void nhap(int dan, int somang, int TocDo) {
        super.nhap(TocDo);
        this.Somang = somang;
        this.soDan = soDan;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
    System.out.println("Sodan"+Sodan);
        System.out.println("Somang"+Somang);

}

     void kiemTraTrungDan() {
        System.out.println("Trung dan");

    }

     void baoVeBot() {
        System.out.println("Bot chac chan");

    }

     void ban() {
        System.out.println("Xe tang ban");

    }


}
