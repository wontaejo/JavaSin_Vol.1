
public class Operators {
    public static void main(String args[]) {
        Operators sample = new Operators();
        sample.additive();
        sample.multiplicative();
        sample.remainder();
    }
    
    public void additive() {
        int intValue1 = 5;
        int intValue2 = 10;
        
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue2 - intValue1;
        System.out.println(result);
    }
    
    public void multiplicative() {
        int intValue1 = 5;
        int intValue2 = 10;
        
        int result = intValue1 * intValue2;
        System.out.println(result);
        //result = intValue2 / intValue1;
        float result2 = (float)intValue1 / intValue2;
        System.out.println(result2);
    }
    
    public void remainder() {
        int intValue1 = 53;
        int intValue2 = 10;
        int result = intValue1 % intValue2;
        System.out.println(result);
    }
}
