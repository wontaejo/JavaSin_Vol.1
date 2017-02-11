package c.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        //sample.arrayOutOfBounds();
        //sample.multiCatch();
        //sample.throwable();
        sample.throwException(5);
    }
    public void arrayOutOfBounds() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code should run.");
    }
    public void multiCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
        } catch (Exception e) {
            System.out.println("Exception occured");
        } 
    }
    public void throwable() {
        int[] intArray = new int[5];
        try {
           //intArray = null;
           System.out.println(intArray[5]);
        } catch (Throwable t) {
            //System.out.println(t.toString());
            t.printStackTrace();
        }
    }
    public void throwException(int number) {
        try {
            if(number > 12) {
                throw new Exception("Number is over then 12");    
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
