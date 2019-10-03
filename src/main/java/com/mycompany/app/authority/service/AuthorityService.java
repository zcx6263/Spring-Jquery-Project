package com.mycompany.app.authority.service;

import java.util.List;

import com.mycompany.app.authority.model.AuthorityMgt;

public interface AuthorityService {
    public List<AuthorityMgt> getAuthorityList() throws Exception;
}
