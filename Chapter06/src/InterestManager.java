
public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        //System.out.println(manager.getInterestRate(365));
        long sumMoney = 0;
        long Money = 1000000;
        // 1일 단위 이자금액
        for(int i=1; i<366; i++) {
            sumMoney += manager.calculateAmount(i, Money) - Money;
            System.out.println(i + "일 : " + sumMoney);
        }
        
        // 10일 단위 이자금액
        for(int i=1; i<366; i++) {
            sumMoney += manager.calculateAmount(i, Money) - Money;
            if(i % 10 == 0 || i == 365) {
                System.out.println(i + "일 : " + sumMoney);
            }
        }
    }
    
    public double getInterestRate(int day) {
        double result = 0;
        if(day <= 90) {
            result = 0.5;
        } else if(day > 90 && day <= 180) {
            result = 1;
        } else if(day > 180 && day <= 364) {
            result = 2;
        } else if(day == 365) {
            result = 5.6;
        }
        return result; 
    }
    
    public double calculateAmount(int day, long amount) {
        double result = 0;
        result = amount * (1 + getInterestRate(day) / 100);
        return result;
    }
}
