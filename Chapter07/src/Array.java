
public class Array {
    
    static String[] month = { "January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November",
            "December" };
    
    public static void main(String[] args) {
        
        if(args.length > 0) {
            for(String arg : args) {
                System.out.println(arg);
            }
        }
        
        Array array = new Array();
        //array.init();
        //array.primitiveTypes();
        //array.referenceTypes();
        //array.otherInit();
        array.printArrayLength();
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
        
        System.out.println("byteArray" + byteArray);
        System.out.println("shortArray" + shortArray);
        System.out.println("intArray" + intArray);
        System.out.println("longArray" + longArray);
        System.out.println("floatArray" + floatArray);
        System.out.println("doubleArray" + doubleArray);
        System.out.println("charArray" + charArray);
        System.out.println("booleanArray" + booleanArray);
    }
    
    public void referenceTypes() {
        String[] strings = new String[2];
        Array[] array = new Array[2];      
        strings[0] = "Please visit www.GodOfJava.com.";
        array[0] = new Array();
        System.out.println("strings[0] = " + strings[0]);
        System.out.println("strings[1] = " + strings[1]);
        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);
        System.out.println("strings = " + strings);
        System.out.println("array = " + array);
    }
    
    public void otherInit() {
        int[] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
        /* 에러 
        int[] lottoNumbers;
        lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
        */
        String[] month = { "January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November",
                "December" };
    }
    
    public void twoDimensionArray() {
        int[][] twoDim;
        twoDim = new int[2][3];
        
        // towDim = new int[2][];
        
        // towDim = new int[][]; 컴파일 에러
        // towDim = new int[][2]; 컴파일 에러
        
        // twoDim = new int[2][];
        // twoDim[0] = new int[3];
        // twoDim[1] = new int[2];
        
        // int[][] twoDim = {{1, 2, 3,}, {4, 5, 6}};
         
        // int[][] twoDim = new int[2][3];
        // twoDim [0][0] = 1;
        // twoDim [0][1] = 2;
        // twoDim [0][2] = 3;
        // twoDim [1][0] = 4;
        // twoDim [1][1] = 5;
        // twoDim [1][2] = 6;
    }
    
    public void printArrayLength() {
        
        int monthLength = month.length;
        System.out.println(monthLength);
        
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);
        
        int twoDim1Length = twoDim[1].length;
        
        // int twoDim0_0Length = twoDim[0][0].length 해당 배열의 값
        
        int twoDimLength = twoDim.length;
        for(int loop1=0; loop1<twoDimLength; loop1++) {
            int twoDim2Length = twoDim[loop1].length;
            for(int loop2=0; loop2<twoDim2Length; loop2++) {
                System.out.println("twoDim[" + loop1 + "][" + loop2 + "]" + twoDim[loop1][loop2]);
            }
        }
        
        for(String tempMonth : month) {
            System.out.println(tempMonth);
        }
        
        int count1 = 0;
        for(int[] tempArray : twoDim) {
            int count2 = 0;
            for(int temp : tempArray) {
                System.out.println("twoDim[" + count1 + "][" + count2 + "]=" + temp);
                count2++;
            }
            count1++;
        }
    }
}