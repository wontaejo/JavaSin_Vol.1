
public class ControlOfFlow {
    public static void main(String[] args) {
        ControlOfFlow control = new ControlOfFlow();
        //control.ifStatement();
        //control.ifStatement2();
        control.ifStatement3();
    }
    
    public void ifStatement() {
        if(true);
        if(true) System.out.println("It's true");
        if(true)
            System.out.println("It's also true.");
        if(false) System.out.println("It's false");
    }
    
    public void ifStatement2() {
        int intValue = 10;
        
        if(intValue > 5) System.out.println("It's bigger than 5.");
        else System.out.println("It's smaller or equal than 5.");
        
        if(intValue <= 5)
            System.out.println("It's smaller or equal than 5.");
        else
            System.out.println("It's bigger than 5.");
    }
    
    public void ifStatement3() {
        int age = 25;
        boolean isMarried = true;
        if(age > 25 && isMarried) {
            System.out.println("Age is over 25 and Married");
        }
        if(age > 25 || isMarried) {
            System.out.println("Age is over 25 or Married");
        }
        double height = 180;
        if((age > 25 || isMarried) && height >= 180) {
            System.out.println("Age is over 25 or Married and height is over 180");
        }
    }
}

