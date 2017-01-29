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
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        
        MemberDTO other = (MemberDTO) obj;
        
        if(name == null) {
            if(other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        
        if(phone == null) {
            if(other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;
        
        if(email == null) {
            if(other.email != null) return false;
        } else if (!email.equals(other.email)) return false;
        
        return true;
    }
    
    public String toString() {
        return "Name = " + name + ", Phone = " + phone + ", Email = " + email;
    }
    
}
