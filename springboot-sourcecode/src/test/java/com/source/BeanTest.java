package com.source;

import com.source.bean.MyRegistryBean;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class BeanTest extends BaseTest{
    @Resource
    private MyRegistryBean myRegistryBean;
    @Test
    public void beanTest(){
        System.out.println(myRegistryBean.getAge());
    }
}
