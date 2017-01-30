package c.enums;

public class OverTimeManager {
    public static void main(String[] args) {
        //OverTimeManager manager = new OverTimeManager();
        //int myAmount = manager.getOverTimeAmount(OverTimeValues.FIVE_HOUR);
        //OverTimeValues value = OverTimeValues.THREE_HOUR;
        //int myAmount = manager.getOverTimeAmount(value);
        //System.out.println(myAmount);
        /*
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(value2);
        System.out.println(value2.getAmount());
        
        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;
        System.out.println(value2.compareTo(value3));
        */
        OverTimeValues2[] valueList = OverTimeValues2.values();
        for(OverTimeValues2 value : valueList) {
            System.out.println(value);
        }
    }
    
    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        System.out.println(value);
        switch(value) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }
        return amount;
    }
}
