package c.exception;

public class ExceptionSample {
    
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        //sample.arrayOutOfBounds();
        sample.finallySample();
    }
    
    public void arrayOutOfBounds() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            //System.out.println("Exception occured.");
            System.out.println(intArray.length);
        }
        System.out.println("This code should run.");
    }
    
    public void finallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[4]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code should run.");
    }
}
