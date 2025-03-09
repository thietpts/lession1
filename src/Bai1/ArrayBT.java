package src.Bai1;
import java.util.ArrayList;


public class ArrayBT {
    ArrayList <Integer> arr = new ArrayList<>();
    static int so1 = 1;
    int so2 =1;

    void vongLap(){
        for(int i=0; i<5; i++){
            so1++;
        }
    }

    void vongLap2(){
        for(int i=0; i<5; i++){
            so2++;
        }
    }

    void inso(){
        System.out.println(so1);
        System.out.println(so2);
    }

    public static void main(String[] args) {
        ArrayBT arr = new ArrayBT();
        arr.vongLap();
        arr.vongLap2();
        arr.inso();
        ArrayBT arr1 = new ArrayBT();
        arr1.vongLap();
        arr1.vongLap2();
        arr1.inso();
    }
}
