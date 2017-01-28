
public class ReferenceTypes {
    public ReferenceTypes() {
        
    }
    
    public ReferenceTypes(String date) {
        
    }
    
    public static void main(String[] args) {
        ReferenceTypes reference = new ReferenceTypes();
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
}
