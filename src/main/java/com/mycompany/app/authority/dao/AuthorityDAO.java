package com.mycompany.app.authority.dao;

import java.util.List;

import com.mycompany.app.authority.model.AuthorityMgt;

public interface AuthorityDAO {
    
    public List<AuthorityMgt> getAuthorityList() throws Exception;
}
