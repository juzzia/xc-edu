package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MenuMapperTest {

    @Autowired
    MenuMapper menuMapper;

    @Test
    public void testMenuList(){
        List<XcMenu> list = menuMapper.getXcMenuListFromUserId("50");
        System.out.println(list);


    }


}
