package com.company.template.dao;


import com.company.template.JdbcTemplate;
import com.company.template.entity.Goods;
import com.company.template.entity.RowMapper;

import java.lang.reflect.Member;
import java.sql.ResultSet;
import java.util.List;

public class GoodsDao {
    //不继承的原因是解耦

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);
    public List<?> query(){
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql,new RowMapper<Goods>(){
            @Override
            public Goods mapRow(ResultSet rs, int rowNum) throws Exception {
                Goods goods = new Goods();
                goods.setUid(rs.getString("123"));
                goods.setOrderNumber(rs.getString("ordernumber"));
                goods.setNumber(rs.getInt(2));
                goods.setPrice(rs.getDouble(111));
                goods.setProduct(rs.getString("product"));
                return goods;
            }
        },null);
    }
}

