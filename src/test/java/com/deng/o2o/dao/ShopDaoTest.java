package com.deng.o2o.dao;

import com.deng.o2o.BaseTest;
import com.deng.o2o.entity.Area;
import com.deng.o2o.entity.PersonInfo;
import com.deng.o2o.entity.Shop;
import com.deng.o2o.entity.ShopCategory;
import com.deng.o2o.enums.ShopStateEnum;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ShopDaoTest extends BaseTest {

    @Autowired
    private ShopDao shopDao;

    @Test
    public void testInsertShop(){
        Shop shop = new Shop();
        PersonInfo personInfo = new PersonInfo();
        ShopCategory shopCategory = new ShopCategory();
        Area area = new Area();
        personInfo.setUserId(1L);
        shopCategory.setShopCategoryId(1L);
        area.setAreaId(1);
        shop.setOwner(personInfo);
        shop.setShopCategory(shopCategory);
        shop.setArea(area);
        shop.setShopName("木炭烧烤");
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");
        shop.setCreateTime(new Date());
        shop.setShopAddr("东区商业街3号");
        shop.setShopDesc("烧烤店");
        shop.setPhone("15356420241");
        shop.setPriority(3);
        shop.setShopImg("test");
        int i = shopDao.insertShop(shop);
        System.out.println(i);


    }

    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(41L);
        shop.setShopAddr("东区商业街2号");
        shop.setLastEditTime(new Date());
        int i = shopDao.updateShop(shop);
        System.out.println(i);


    }
}
