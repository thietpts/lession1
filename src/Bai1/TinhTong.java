package src.Bai1;

public class TinhTong {

    void TongInt(int a, int b){
        int tong = a+b;
        System.out.println("Tổng 2 số nguyên: "+a+" + "+b +" = " +tong);
    }

    void TongDbl(double a, double b){
        double tong = a+b;
        System.out.println("Tổng 2 số thực: "+a+" + "+b +" = " +tong);
    }

    public static void main(String[] args) {
        TinhTong tinhTong = new TinhTong();
        tinhTong.TongInt(5, 15);
        tinhTong.TongDbl(6.8, 23.66);
    }
}
