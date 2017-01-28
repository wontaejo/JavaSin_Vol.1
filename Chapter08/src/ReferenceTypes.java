
public class ReferenceTypes {
    public ReferenceTypes() {
        
    }
    
    public ReferenceTypes(String date) {
        
    }
    
    public static void main(String[] args) {
        ReferenceTypes reference = new ReferenceTypes();
        //MemberDTO.staticMethod();
        //reference.checkMemberDTOName();
        //reference.makeStaticBlockObject();
        reference.callPassByValue();
    }
    
    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmain");
        MemberDTO dto3 = new MemberDTO("Sangmain", "010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("Sangmain", "010XXXXYYYY", "god@godofjava.com");
    }
    
    public void print(int data) {
    }
    
    public void print(String data) {
    }
    
    public void print(int intData, String stringData) {
    }
    
    public void print(String stringData, int intData) {
    }
    
    public int intReturn() {
        int returnInt = 0;
        return returnInt;      
    }
    
    public int[] intArrayReturn() {
        int[] returnArray = new int[10];
        return returnArray;
    }
    
    public String stringReturn() {
        String returnString = "Return value";
        return returnString;
    }
    
    public void checkMemberDTOName() {
        MemberDTO dto1 = new MemberDTO("Sangmin");
        System.out.println(dto1.name);
        MemberDTO dto2 = new MemberDTO("Sungchoon");
        System.out.println(dto1.name);
    }
    
    public void makeStaticBlockObject() {
        System.out.println("data=" + StaticBlock.getData());
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
        System.out.println("data=" + StaticBlock.getData());
    }
    
    public void callPassByValue() {
        int a = 10;
        String b = "b";
        
        MemberDTO member = new MemberDTO("Sangmin");
        passByValue(a, b, member);
        
        System.out.println("callPassByValue method result !!!");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("member.name=" + member.name);
    }
    
    public void passByValue(int a, String b, MemberDTO member) {
        a = 20;
        b = "z";
        //member = new MemberDTO("SungChoon");
        member.name = "SungChoon";
        System.out.println("passByValue method result !!!");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("member.name=" + member.name);
    }
    // passByValue method result !!!
    // a = 20
    // b = z
    // member.name = SungChoon
    // callPassByValue method result !!!
    // a = 10
    // b = b
    // member.name = Sangmin -> SungChoon
}
