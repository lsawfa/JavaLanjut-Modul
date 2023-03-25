/**
 * @author Larynt Sawfa Kenanga_202110370311189_ProglanD
 * @version 20/12/2022
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main extends Throwable {

    private static double[] inNumber;
    private static String[] inString;
    private static Random index;
    private static FileWriter writer;
    private static Scanner inputUser;
    private static String fileAddres2;
    private static String fileAddres1;

    /**
     * Method Main sebagai fungsi utama yang digunakan untuk inisialisasi beberapa variabel dan pemanggilan fungsi writer serta reader dari file txt
     * @throws Exception Jika terjadi error yang termasuk dalam error exception, maka akan dihandle oleh Exception
     * @exception Main exception handling untuk inputan tidak boleh kosong
     * @exception Exception to error yang ada di exception
     */
    public static void main(String[] args) throws Exception{
        fileAddres1 = "E:\\Java_Lanjut\\Modul6\\src\\Number.txt";
        fileAddres2 = "E:\\Java_Lanjut\\Modul6\\src\\String.txt";
        inNumber = new double[100];
        inString = new String[100];
        inputUser = new Scanner(System.in);
        index = new Random();
        while (true){
            System.out.print("Inputkan nilai : ");
            String inputTemp = inputUser.nextLine();
            try {
                if (inputTemp.charAt(0)==' '||inputTemp==null){
                    throw new Main();
                }else {
                    try {
                        inNumber[index.nextInt(100)]=Double.parseDouble(inputTemp);
                        System.out.println("Inputan anda disimpan dalam array inNumber");
                    }catch (Exception e){
                        inString[index.nextInt(100)]=inputTemp;
                        System.out.println("Inputan anda disimpan dalam array inString");
                    }
                    System.out.print("Type yes if you want to stop input data ! ");
                    String stopper = inputUser.nextLine();
                    if(stopper.equals("yes")||stopper.equals("YES")||stopper.equals("Yes")){
                        break;
                    }
                    System.out.println("----------------------------------------------------");
                }
            }catch (Main e){
                System.out.println(e+": Input tidak boleh kosong");
            }catch (Exception e){
                System.out.println(e);
            }
        }
        writerText();
        printout(fileAddres1, fileAddres2);
    }

    /**
     * Method writerText() digunakan untuk menulis inputan user ke dalam database file txt
     * @exception IOException exception untuk input/output
     */
    private static void writerText() {
        try{
            writer = new FileWriter(fileAddres1,true);
            for (int i = 0; i< inNumber.length; i++){
                if(inNumber[i]==0.0){
                    continue;
                }else {
                    writer.write("\n- Index ke-"+i+" = "+ inNumber[i]);
                }
            }
            writer.close();
            writer = new FileWriter(fileAddres2,true);
            for (int i = 0; i< inString.length; i++){
                if(inString[i]==null|| inString[i].charAt(0)==' '){
                    continue;
                }else {
                    writer.write("\n- Index ke-"+i+" = "+ inString[i]);
                }
            }
            writer.close();
        }catch (IOException ex){
            System.out.println("Error : "+ex);
        }
    }

    /**
     * Method printout() digunakan untuk menampilkan atau print data yang sudah diinputkan ke database txt
     * @param fileAddres1 string lokasi file Number.txt
     * @param fileAddres2 string lokasi file String.txt
     * @exception Exception to error yang ada di exception
     */
    private static void printout(String fileAddres1, String fileAddres2) {
        Scanner fileReader;
        File myFile;
        try{
            myFile = new File(fileAddres1);
            fileReader = new Scanner(myFile);
            System.out.println("Data inNumber : ");
            while (fileReader.hasNextLine()){
                String output = fileReader.nextLine();
                System.out.println(output);
            }
            myFile = new File(fileAddres2);
            fileReader = new Scanner(myFile);
            System.out.println("Data inString : ");
            while (fileReader.hasNextLine()){
                String output = fileReader.nextLine();
                System.out.println(output);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}