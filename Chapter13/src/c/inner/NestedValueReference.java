package c.inner;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;
    static class StaticNested {
        private int staticNestedInt = 99;
        public void setValue() {
            staticInt = 14;
        }
    }
    class Inner {
        private  int innerValue = 100;
        public void setValue() {
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt =23;
            staticInt =24;
        }
    }
    public void setValue() {
        EventListener listener = new EventListener() {
            public void onClick() {
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
    }
    public void setValue(int value) {
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
