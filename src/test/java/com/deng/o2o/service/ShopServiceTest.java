package com.deng.o2o.service;

import com.deng.o2o.BaseTest;
import com.deng.o2o.dao.ShopDao;
import com.deng.o2o.dto.ShopExecution;
import com.deng.o2o.entity.Area;
import com.deng.o2o.entity.PersonInfo;
import com.deng.o2o.entity.Shop;
import com.deng.o2o.entity.ShopCategory;
import com.deng.o2o.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

public class ShopServiceTest extends BaseTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop() throws FileNotFoundException {
        Shop shop = new Shop();
        PersonInfo personInfo = new PersonInfo();
        ShopCategory shopCategory = new ShopCategory();
        Area area = new Area();
        personInfo.setUserId(1L);
        shopCategory.setShopCategoryId(2L);
        area.setAreaId(1);
        shop.setOwner(personInfo);
        shop.setShopCategory(shopCategory);
        shop.setArea(area);
        shop.setShopName("重庆鸡公煲");
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");
        shop.setCreateTime(new Date());
        shop.setShopAddr("东区商业街1号");
        shop.setShopDesc("专做鸡公煲");
        shop.setPhone("18475133980");
        shop.setPriority(2);
        File shopImg = new File("D:\\image\\jigongbao.jpg");
        InputStream is = new FileInputStream(shopImg);
        shopService.addShop(shop, is,shopImg.getName());
        System.out.println();
    }
}
