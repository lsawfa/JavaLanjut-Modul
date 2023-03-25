import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int data[] = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        //Sorting
        for(int i=0; i<data.length-1; i++){
            for (int j=0; j<data.length-i-1; j++){
                if(data[j]>data[j+1]){
                    int x = data[j];
                    data[j]=data[j+1];
                    data[j+1]=x;
                }
            }
        }
        //print the Array to check data already sorted
        for(int i=0; i< data.length; i++){
            System.out.print(data[i]+" ");
        }

        //Search index element from user input
        System.out.print("\nMasukkan data yang indexnya akan dicari : ");
        int datasrch = inputUser.nextInt();
        for(int i=0; i<data.length; i++){
            if(datasrch==data[i]){
                System.out.println("Index array data "+datasrch+" yang telah diurutkan adalah "+i);
            }
        }
        System.out.println("Data yang anda cari tidak ada pada array data");
    }
}