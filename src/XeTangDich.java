
class XeTangDich extends Dan {
    int Dan;
    String Loaixe;

    void nhap(int dan, String loaixe, int Tocdo) {
        super.nhap(Tocdo);
        this.Dan = dan;
        this.Loaixe = loaixe;
    }

    void ban() {
        System.out.println("Xe tang ban");

    }

    void kiemTraTrungDan() {
        System.out.println("Trung dan");
    }

    void phaHuyBot() {
        System.out.println("Bot bi hong");

    }
