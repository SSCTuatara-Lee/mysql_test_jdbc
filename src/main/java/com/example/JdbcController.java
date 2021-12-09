package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping("/aa")
    public List<Map<String,Object>> userList(){
        String sql = "select * from ss_company";
        List<Map<String,Object>> list_map = jdbcTemplate.queryForList(sql);
        return list_map;

    }




}
