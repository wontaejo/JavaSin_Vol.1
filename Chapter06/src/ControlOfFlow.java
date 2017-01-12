
public class ControlOfFlow {
    public static void main(String[] args) {
        ControlOfFlow control = new ControlOfFlow();
        //control.ifStatement();
        //control.ifStatement2();
        //control.ifStatement3();
        //control.ifStatement4(90);
        //control.switchStatement(1);
        //control.switchStatement2(4);
        //control.whileLoop();
        //control.whileLoop2();
        control.forLoop(10);
    }
    
    public void control() {
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
    
    public void ifStatement4(int point) {
        if(point > 90) {
            System.out.println("A");
        } else if(point > 80) {
            System.out.println("B");
        } else if(point >70) {
            System.out.println("C");
        } else if(point > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    
    public void switchStatement(int numberOfWheel) {
        switch(numberOfWheel) {
            case 1:
                System.out.println("It is one foot bicycle.");
                //break;
            case 2:
                System.out.println("It is a motor cycle or bicycle.");
                //break;
            case 3:
                System.out.println("It is a three wheel car.");
                break;
            case 4:
                System.out.println("It is a car.");
                break;
            default:
                System.out.println("It is an expensive car.");
                break;
        }
    }
    
    public void switchStatement2(int month) {
        switch(month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println(month + " has 31 days.");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println(month + " has 30 days.");
            break;
        case 2:
            System.out.println(month + " has 28 or 29 days.");
            break;
        default:
            System.out.println(month + " is not a mont");
        }
    }
    
    public void whileLoop() {
        int loop = 0;
        while (loop < 12) {
            loop++;
            switchStatement2(loop);
            /*
            if(loop >= 6) {
                break;
            }
            */
        }
    }
    
    public void whileLoop2() {
        int loop = 0;
        do {
            loop++;
            switchStatement2(loop);
        } while(loop < 12);
     
    }
    
    public void forLoop(int until) {
        int sum = 0;
        for(int loop=1; loop<=until; loop++) {
            sum+=loop;
        }
        System.out.println("1 to " + until + " = " + sum);
    }
}

