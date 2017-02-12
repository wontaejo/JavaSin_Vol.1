package c.annotation;

import java.lang.reflect.Method;

public class UserAnnotationSample {
    @UserAnnotation(number=0)
    public static void main(String[] args) {
        //UserAnnotationSample sample = new UserAnnotationSample();
        //sample.checkAnnotations(UserAnnotationSample.class);
        /*
        String[] a = new String[2]{"일잘함", "출근잘함"};
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        */
        String[] a = new String[2];
        a[0] = "일잘함";
        a[1] = "출근잘함";
        for(int i=0; i<a.length; i++) {
            //System.out.println(a[i]);
        }
        int count = 0;
        for(String temp:a) {
            System.out.println(a[count]);
            count++;
        }
        
    }
    @UserAnnotation(number=1)
    public void annotationSample1() {
    }
    @UserAnnotation(number=2, text="second")
    public void annotationSample2() {
    }
    @UserAnnotation(number=3, text="third")
    public void annotationSample3() {
    }
    public void checkAnnotations(Class useClass) {
        Method[] method = useClass.getDeclaredMethods();
        for(Method tempMethod:method) {
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);
            if(annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tempMethod.getName() + "() : number =" + number + " text=" + text);
            } else {
                System.out.println(tempMethod.getName() + "() : annotation is null.");
            }
        }
    }
}
