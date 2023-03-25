import java.util.Scanner;

public class Tugas2 extends Exception {
    public Tugas2(String s){
        super(s);
    }
    private long nim;
    public void inputnim() {
        Scanner inputUser = new Scanner(System.in);
        String inputan;
        while (true){
            System.out.print("Input your NIM : ");
            inputan=inputUser.nextLine();
            try {
                setNim(Long.parseLong(inputan));
                if(String.valueOf(getNim()).contains("10370311")){
                    if(String.valueOf(getNim()).length()==15){
                        System.out.println("Your NIM is : "+getNim());
                        break;
                    }else if(String.valueOf(getNim()).length()>15){
                        try{
                            throw new Tugas2("NIM tidak boleh lebih dari 15 digit");
                        }catch (Tugas2 e){
                            System.out.println("Error : "+e.getMessage());
                        }
                    }else if(String.valueOf(getNim()).length()<15){
                        try{
                            throw new Tugas2("NIM tidak boleh kurang dari 15 digit");
                        }catch (Tugas2 e){
                            System.out.println("Error : "+e.getMessage());
                        }
                    }
                }else {
                    try{
                        throw new Tugas2("NIM must contain \"10370311\"");
                    }catch (Tugas2 e){
                        System.out.println("Error : "+e.getMessage());
                    }
                }
            }catch (Exception e){
                System.out.println("Error : Input harus berupa angka and"+e);
            }
        }
    }
    public long getNim() {
        return nim;
    }
    public void setNim(long nim) {
        this.nim = nim;
    }
    public static void main(String[] args) {
        Tugas2 obj = new Tugas2("");
        System.out.println("=== PROGRAM INPUT NIM MAHASISWA INFORMATIKA ===");
        obj.inputnim();
    }
}