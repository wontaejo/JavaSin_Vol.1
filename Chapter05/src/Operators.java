
public class Operators {
    public static void main(String args[]) {
        Operators sample = new Operators();
        sample.additive();
    }
    
    public void additive() {
        int intValue1 = 5;
        int intValue2 = 10;
        
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue2 - intValue1;
        System.out.println(result);
    }
}
