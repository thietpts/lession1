package src.Bai1;

public class ToanTu {
    int so1 = 100;
    int so2 = 50;
    void toanTu(int n){
        if(so1 > n){
            System.out.println(so1 + " > " + n);
        } else if (so1==n) {
            System.out.println(so1 + " = " + n);
        } if (so1>n && so2 <n) {
            System.out.println("Hello 2");
        }if (so1<n || so2 <n){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        ToanTu tt = new ToanTu();
        tt.toanTu(10);
        tt.toanTu(100);
        tt.toanTu(50);
        tt.toanTu(20);

    }
}
