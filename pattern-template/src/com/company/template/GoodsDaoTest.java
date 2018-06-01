package com.company.template;

import com.company.template.dao.GoodsDao;
import com.company.template.entity.Goods;

import javax.sql.DataSource;

public class GoodsDaoTest {

    public static void main(String[] args) {
	// write your code here
        GoodsDao goodsDao = new GoodsDao();
        goodsDao.query();
    }
}
