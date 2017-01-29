package c.inheritance;

public class InheritanceObject {
    public static void main(String[] args) {
        //InheritanceObject obj = new InheritanceObject();
        //obj.toStringMethod(obj);
        //obj.toStringMethod2();
        
        MemberDTO member = new MemberDTO("Sangmin", "010XXXXYYYY", "javauning@gmail.com");
        //System.out.println("name" + member.name + "phone" + member.phone + "email" + member.email);
        System.out.println(member.toString());
        System.out.println(member);
        
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

