
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
        //sample.condition();
        //sample.doBlindDate(30);
        //sample.doBlindDate(80);
        //sample.casting();
        System.out.println(sample.getMonthlySalary(30000000));
        //System.out.println(sample.calculateTax(sample.getMonthlySalary(30000000)));
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
    
    public boolean doBlindDate(int point) {
        
        boolean doBlindDateFlag = false;
        
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
        
        return doBlindDateFlag;
    }
    
    public void casting() {
        byte byteValue = 127;
        short shortValue = 256;
        
        //shortValue++;
        System.out.println(shortValue);
        byteValue = (byte)shortValue;
        System.out.println(byteValue);
    }
    
    public double getMonthlySalary(int yearlySalary) {
        double a = 12.0;
        System.out.println("세금 공제액 : " + calculateTax(yearlySalary / a));
        return yearlySalary / a; 
    }
    
    public double calculateTax(double monthlySalary) {
        double gunSalary = 0;
        double gugSalary = 0;
        double buSalary = 0;    
        gunSalary = monthlySalary * 12.5 / 100;
        gugSalary = monthlySalary * 8.1 / 100;
        buSalary = monthlySalary * 13.5 / 100;
        
        System.out.println("근로 소득세 : " + gunSalary);
        System.out.println("국민 연금 : " + gugSalary);
        System.out.println("건강 보험료 : " + buSalary);
        
        return gunSalary + gugSalary + buSalary;
    }
}
