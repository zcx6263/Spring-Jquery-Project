package com.mycompany.app.authority.model;

import java.util.List;

public class AuthorityMgt {
    public String name;
    public String empNo;
    public String comp;
    public String dept;
    public String proleId;
    public List<String> proleIdList;
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmpNo() {
        return empNo;
    }
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public String getComp() {
        return comp;
    }
    public void setComp(String comp) {
        this.comp = comp;
    }
    public String getProleId() {
        return proleId;
    }
    public void setProleId(String proleId) {
        this.proleId = proleId;
    }
    public List<String> getProleIdList() {
        return proleIdList;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setProleIdList(List<String> proleIdList) {
        this.proleIdList = proleIdList;
    }
    
}
