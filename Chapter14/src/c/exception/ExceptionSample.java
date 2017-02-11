package c.exception;

public class ExceptionSample {
    public static void main(String[] args) throws Exception {
        ExceptionSample sample = new ExceptionSample();
        //sample.arrayOutOfBounds();
        //sample.multiCatch();
        //sample.throwable();
        //try {
        //sample.throwException(13);
        //} catch (Exception e) {
            //e.printStackTrace();
        //}
        try {
            sample.throwException2(13);
        } catch (MyException e) {
            e.printStackTrace();
        }
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
    public void throwException(int number) throws Exception {
        //try {
            if(number > 12) {
                throw new Exception("Number is over then 12");    
            }
        //} catch (Exception e) {
            //e.printStackTrace();
        //}
    }
    public void multiThrow() throws NullPointerException, ArrayIndexOutOfBoundsException {
        int[] intArray = new int[5];
        intArray = null;
        System.out.println(intArray[5]);
    }
    public void throwException2(int number) throws Exception {
        try {
            if(number > 12) {
                throw new MyException("number is over than 12");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
