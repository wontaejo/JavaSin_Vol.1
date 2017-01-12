
public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        //array.init();
        array.primitiveTypes();
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
    
    public void primitiveTypes() {
        byte[] byteArray = new byte[1];
        short[] shortArray = new short[1];
        int[] intArray = new int[1];
        long[] longArray = new long[1];
        float[] floatArray = new float[1];
        double[] doubleArray = new double[1];
        char[] charArray = new char[1];
        boolean[] booleanArray = new boolean[1];
        
        System.out.println("byteArray[0]" + byteArray[0]);
        System.out.println("shortArray[0]" + shortArray[0]);
        System.out.println("intArray[0]" + intArray[0]);
        System.out.println("longArray[0]" + longArray[0]);
        System.out.println("floatArray[0]" + floatArray[0]);
        System.out.println("doubleArray[0]" + doubleArray[0]);
        System.out.println("charArray[0]" + charArray[0]);
        System.out.println("booleanArray[0]" + booleanArray[0]);
    }
}
