package c.inheritance;

public class InheritanceObject {
    public static void main(String[] args) {
        //InheritanceObject obj = new InheritanceObject();
        //obj.toStringMethod(obj);
        //obj.toStringMethod2();
        
        //MemberDTO member = new MemberDTO("Sangmin", "010XXXXYYYY", "javauning@gmail.com");
        //System.out.println("name" + member.name + "phone" + member.phone + "email" + member.email);
        //System.out.println(member.toString());
        //System.out.println(member);
        
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        /*
        if(obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
        */
        if(obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
        
    }
    
    public void toStringMethod(InheritanceObject obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }
    
    public void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " +this);
    }
    
    public String toString() {
        return "InhertianceObject class";
    }
}

