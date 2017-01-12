
public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        array.init();
    }
    
    public void init() {
        int[] lottoNumbers = new int[7];
        lottoNumbers[0] = 5;
        lottoNumbers[1] = 12;
        lottoNumbers[2] = 23;
        lottoNumbers[3] = 25;
        lottoNumbers[4] = 38;
        lottoNumbers[5] = 41;
        lottoNumbers[6] = 2;
        // lottoNumbers[7] = 9; // 예외발생
        // System.out.println(lottoNumbers[7]); // 예외발생
    }
}
