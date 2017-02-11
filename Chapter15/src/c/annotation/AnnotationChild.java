package c.annotation;

import c.inheritance.Parent;

public class AnnotationChild extends Parent {
    @Override
    public void printName() {
        System.out.println("AnnotationChild");
    }
}
