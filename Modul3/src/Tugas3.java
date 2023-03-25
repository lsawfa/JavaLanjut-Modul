public class Tugas3 {
    static boolean isCube(long input){
        long round = Math.round(Math.cbrt(input));
        long l = round * round * round;
        return l ==input;
    }
}