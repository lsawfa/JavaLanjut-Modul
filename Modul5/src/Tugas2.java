import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String args[]) {
        Scanner inputUser = new Scanner(System.in);

        //Deklarasi dan inisialisasi array list
        ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30));

        //Sort
        Collections.sort(data);

        //print the ArrayList to check data already sorted
        System.out.println("List contents:"+data);

        //Search index berdasarkan inputan user
        System.out.print("Masukkan data yang indexnya akan dicari : ");
        int datasrch = inputUser.nextInt();
        if(data.contains(datasrch)==true){
            System.out.println("Index array data "+datasrch+" yang telah diurutkan adalah "+data.indexOf(datasrch));
        }else {
            System.out.println("Data yang anda cari tidak ada pada array data");
        }
    }
}