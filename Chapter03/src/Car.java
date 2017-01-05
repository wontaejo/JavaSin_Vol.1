
public class Car {
    
    public Car() {
        
    }
    
    int speed;
    int distance;
    String color;
    
    public void speedUp() {
        speed = speed + 5;
    }
    
    public void breakDown() {
        speed = speed - 10;
    }
    
    public int getCurrentSpeed() {
        return speed;
    }
}
