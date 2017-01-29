package c.inheritance;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    
    public MemberDTO() {
    }
    
    public MemberDTO(String name) {
        this.name = name;
    }
    
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;    // 주소가 같으므로 당연히 true
        if(obj == null) return false;   // obj가 null 이므로 당연히 false
        if(getClass() != obj.getClass()) return false;  // 클레스의 종류가 다르므로 false
        
        MemberDTO other = (MemberDTO) obj; // 같은 클래스이므로 형 변환 실행
        
        // 이제부터는 각 인스턴스가 변수가 같은지 비교하는 작업 수행
        if(name == null) { // name 가 null 일 때
            if(other.name != null) return false; // 비교 대상의 name이 null이 아니면 false
        } else if (!name.equals(other.name)) return false; // 두 개의 name 값이 다르면 false
        
        // name와 같은 비교 수행
        if(phone == null) {
            if(other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;
        
        if(email == null) {
            if(other.email != null) return false;
        } else if (!email.equals(other.email)) return false;
        
        // 모든 조건을 거쳐서 false를 리턴하지 않는 객체는 같은 값을 가지는 객체로 생각해서 true 리턴
        return true;
    }
    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
    
    public String toString() {
        return "Name = " + name + ", Phone = " + phone + ", Email = " + email;
    }
    
}
