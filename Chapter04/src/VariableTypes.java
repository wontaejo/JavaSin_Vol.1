
public class VariableTypes {
    int instanceVariable;
    static int classVariable;
    public void method(int parameter) {
        int localVariable;
    }
    public void anotherMethod() {
        if(true) {
            int localVariable;
            if(true) {                
                //int localVariable;
            }
        }
        if(true) {
            int localVariable;
        }
    }
}
