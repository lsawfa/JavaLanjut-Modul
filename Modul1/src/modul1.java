public class modul1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            arr[5]=25;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : "+e);
        }finally {
            System.out.println("Program exception handling finished");
        }
    }
}
