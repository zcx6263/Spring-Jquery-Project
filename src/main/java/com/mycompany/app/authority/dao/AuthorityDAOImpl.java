package com.mycompany.app.authority.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.app.authority.model.AuthorityMgt;

@Repository
public class AuthorityDAOImpl implements AuthorityDAO {
    
    @Inject
    private SqlSession sqlSession;

    @Override
    public List<AuthorityMgt> getAuthorityList() throws Exception {
        // TODO Auto-generated method stub
        return sqlSession.selectList("com.mycompany.app.authority.authorityMapper.getAuthorityList");
    }
    
}
