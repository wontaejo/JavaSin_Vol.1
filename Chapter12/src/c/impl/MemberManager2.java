package c.impl;

import c.inheritance.MemberDTO;

public class MemberManager2 extends MemberManagerAbstract {
    
    public boolean addMember(MemberDTO member) {
        return false;
    }
    
    public boolean removeMember(String name, String phone) {
        return false;
    }
    
    public boolean updateMember(MemberDTO member) {
        return false;
    }
    
    public void printLog(String data) {
        System.out.println("Data = " + data);
    }
}
