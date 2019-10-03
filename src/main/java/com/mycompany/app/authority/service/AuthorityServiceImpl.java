package com.mycompany.app.authority.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mycompany.app.authority.dao.AuthorityDAO;
import com.mycompany.app.authority.model.AuthorityMgt;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    
    @Inject
    AuthorityDAO authorityDAO;
    
    @Override
    public List<AuthorityMgt> getAuthorityList() throws Exception {
        // TODO Auto-generated method stub
        return authorityDAO.getAuthorityList();
    }
    
}
