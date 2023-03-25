import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tugas3_1 {
    public static void main(String args[]) {
        Scanner inputUser = new Scanner(System.in);
        int count1=0,count2=0,count3 =0;
        //Deklarasi dan inisialisasi array list
        ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30));

        //Sort
        Collections.sort(data);

        //print the ArrayList to check data already sorted
        System.out.println("List contents:"+data);
        System.out.println("Size : "+data.size());

        //Positif, Negative, and Zero
        for(int i=0; i< data.size(); i++){
            if(data.get(i)==0){
                count1++;
            }else if(data.get(i)>0){
                count2++;
            }else if(data.get(i)<0){
                count3++;
            }
        }
        System.out.println("\nPositive : "+(float)count2/ data.size());
        System.out.println("Negative : "+(float)count3/ data.size());
        System.out.println("Zero : "+(float)count1/ data.size());
    }
}