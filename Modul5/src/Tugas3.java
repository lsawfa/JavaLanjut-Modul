public class Tugas3 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int data[] = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.println("Size : "+data.length);
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
        System.out.print("Result : ");
        for(int i=0; i< data.length; i++){
            System.out.print(data[i]+" ");
        }
        //Positif, Negative, and Zero
        for(int i=0; i< data.length; i++){
            if(data[i]==0){
                count1++;
            }else if(data[i]>0){
                count2++;
            }else if(data[i]<0){
                count3++;
            }
        }
        System.out.println("\nPositive : "+(float)count2/ data.length);
        System.out.println("Negative : "+(float)count3/ data.length);
        System.out.println("Zero : "+(float)count1/ data.length);
    }
}