package src.Bai1;

import java.util.HashSet;
import java.util.Set;

public class MangVongLap {
    public static void main(String[] args) {
        Set <Integer> arr = new HashSet<>();
        for (int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println(i);
            }
            arr.add(i);
        }
        System.out.println(arr);
    }
}
