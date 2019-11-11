package com.zenghao.springboot.hellomybatis;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zenghao.springboot.hellomybatis.entity.TUser;
import com.zenghao.springboot.hellomybatis.mapper.TUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootTest
class HelloMybatisApplicationTests {

    @Autowired
    TUserMapper tUserMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void tUserMapperTest(){
        //System.out.println(tUserMapper.selectByPrimaryKey(1).toString());

        //紧跟PageHelper.sartPage静态放到的第一个查询会自动分页
        PageHelper.startPage(1,5);
        List<TUser> list = tUserMapper.selectAll();
        for (TUser user : list) {
            //System.out.println(user);
        }


        //查询条件通过example实现
        Example example = new Example(TUser.class);
        example.createCriteria()
                .andEqualTo("username","小皓皓");
        //System.out.println(tUserMapper.selectByExample(example));


        //分页和条件通是使用
        PageHelper.startPage(2,1);
        Example example1 = new Example(TUser.class);
        example1.createCriteria()
                .andEqualTo("isDelete",0);
        list = tUserMapper.selectByExample(example1);
        for (TUser user : list) {
            System.out.println(user);
        }
    }



}
