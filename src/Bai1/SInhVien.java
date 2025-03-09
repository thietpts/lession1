package src.Bai1;

public class SInhVien {
    String hoTen= "Trang";
    int toan = 8;
    int van = 9;
    static String lop = "9A";

    void TinhDiem(){
        double trungBinh = (double) (toan + van) /2;
        System.out.println(hoTen);
        System.out.println("TB: "+trungBinh);

    }

    public static void main(String[] args) {
        SInhVien    sv = new SInhVien();
        System.out.println("Kết quả điểm của " + lop);
        sv.TinhDiem();
        ThongTin  tt=new ThongTin();
        System.out.println(ThongTin.hoVaTen);
    }

}

