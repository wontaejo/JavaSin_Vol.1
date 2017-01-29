package c.javapackage;

import c.javapackage.sub.Sub;
//import c.javapackage.sub.*;
//import static c.javapackage.sub.Sub.subClassStaticMethod;
//import static c.javapackage.sub.Sub.CLASS_NAME;

public class Package {
    //public final static String CLASS_NAME = "main";
    public static void main(String[] args) {
        //System.out.println("Package class.");
        //Sub sub = new Sub();
        //sub.subClassMethod();
        //subClassStaticMethod();
        //System.out.println(CLASS_NAME);
        Sub sub = new Sub();
        sub.publicMethod();
        //sub.protectedMethod();
        //sub.packagePrivateMethod();
        //sub.privateMethod();
    }
}
                    