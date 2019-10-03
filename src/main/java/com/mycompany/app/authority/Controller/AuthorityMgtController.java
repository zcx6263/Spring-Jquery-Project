package com.mycompany.app.authority.Controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mycompany.app.authority.model.AuthorityMgt;
import com.mycompany.app.authority.service.AuthorityService;
import com.mycompany.common.JsonUtils;

@Controller
@RequestMapping(value = "/")
public class AuthorityMgtController {
    
    @Inject
    AuthorityService authorityService;
    
    private static final Logger logger = LoggerFactory.getLogger(AuthorityMgtController.class);
    
    @RequestMapping("/")
    public String authorityMgtList() {
        logger.info("authorityMgtList");
        
        return "bpm/authorityMgtList";
    }
    
    @RequestMapping(value = "getAuthorityMgtList")
    public void getAuthorityMgtList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.warn("getAuthorityMgtList");
        
        PrintWriter out = null;
        response.setCharacterEncoding("UTF-8");
        String param = request.getParameter("param");
        System.out.println("/// "+param);
        Map<String, Object> castMap = new HashMap<String, Object>();
        HashMap<String, Object> resMap = new HashMap<String, Object>();
        castMap = JsonUtils.JsonToMap(param);
        
        List<AuthorityMgt> list = new ArrayList<>();
        AuthorityMgt test1 = new AuthorityMgt();
        AuthorityMgt test2 = new AuthorityMgt();
        test1.setName("wy");
        test2.setName("wt");
        list.add(test1);
        list.add(test2);
        
        resMap.put("records",10);
        resMap.put("rows",list);
        
        out = response.getWriter();
        out.write(JsonUtils.HashMapToJson(resMap).toString());
        
    }
}
