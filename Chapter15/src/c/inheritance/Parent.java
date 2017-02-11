package c.inheritance;

public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
    public Parent(String name) {
        System.out.println("Parent(String) Constructor");
    }
    public void printName(String args) {
        System.out.println("PrintName() - Parent");
    }
}
