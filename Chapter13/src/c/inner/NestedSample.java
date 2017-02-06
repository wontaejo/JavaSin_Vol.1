package c.inner;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }
    
    public void makeStaticNestedObject() {
        OuterOfStatic.StaticNeted staticNested = new OuterOfStatic.StaticNeted();
        staticNested.setValue(3);
        
        System.out.println(staticNested.getValue());
    }
    
    public void makeInnerObject() {
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
