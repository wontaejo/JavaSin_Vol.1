public class Student {
    String name;
    String address;
    String phone;
    String email;
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, String address, String phone, String email) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        
        Student student = (Student) obj;
        
        if(name == null) {
            if(student.name != null) return false;
        } else if(!name.equals(student.name)) {
            return false;
        }

        if(address == null) {
            if(student.address != null) return false;
        } else if(!address.equals(student.address)) {
            return false;
        }
        
        if(phone == null) {
            if(student.phone != null) return false;
        } else if(!phone.equals(student.phone)) {
            return false;
        }

        if(email == null) {
            if(student.email != null) return false;
        } else if(!email.equals(student.email)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
    
}
