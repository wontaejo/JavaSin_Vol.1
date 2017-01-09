
public class Operators {
    public static void main(String args[]) {
        Operators sample = new Operators();
        //sample.additive();
        //sample.multiplicative();
        //sample.remainder();
        //sample.compound();
        //sample.unary();
        //sample.increDecre();
        //sample.complement();
        //sample.comparsion();
        //sample.comparsion2();
        sample.condition();
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
    
    public void compound() {
        int intValue1 = 10;
        intValue1 += 5;
        System.out.println(intValue1);
        intValue1 -= 5;
        System.out.println(intValue1);
        intValue1 *= 5;
        System.out.println(intValue1);
        intValue1 /= 5;
        System.out.println(intValue1);
        intValue1 %= 5;
        System.out.println(intValue1);
    }
    
    public void unary() {
        int intValue = -10;
        int result = +intValue;
        System.out.println(result);
        result = -intValue;
        System.out.println(result);
    }
    
    public void increDecre() {
        int intValue = 1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }
    
    public void complement() {
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }
    
    public void comparsion() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;
        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);
        
        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
        
        System.out.println("-------");
        
        char charValue = 'a';
        System.out.println(97 == charValue);
        double doubleValue = 1.0;
        System.out.println(intValue1 == doubleValue);
    }
    
    public void comparsion2() {
        int intValue1 = 1;
        int intValue2 = 2;
        System.out.println(intValue1 > intValue2);
        System.out.println(intValue1 < intValue2);
        
        System.out.println(intValue1 >= intValue2);
        System.out.println(intValue1 <= intValue2);
    }
    
    public void condition() {
        boolean x = true;
        boolean y = true;
        
        System.out.println(x && y);  // true
        System.out.println(x || y);  // true
        System.out.println("-----");
        x = false;
        System.out.println(x && y);  // false
        System.out.println(x || y);  // true
        System.out.println("-----");
        y = false;
        System.out.println(x && y);  // false
        System.out.println(x || y);  // false
    }
}
