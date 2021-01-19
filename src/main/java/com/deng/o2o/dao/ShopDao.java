package com.deng.o2o.dao;

import com.deng.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopDao {
    /**
     * 分页查询店铺，可根据店铺名模糊查询，店铺状态查询，店铺类别，区域id和owner查询
     * @param shop
     * @param rowIndex从第几行开始取数据
     * @param pageSize返回的条数
     * @return
     */
    List<Shop> queryShopList(@Param("shopCondition") Shop shop, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    /**
     * 返回queryShopList的总数
     * @param shopCondition
     * @return
     */
    int queryShopCount(@Param("shopCondition") Shop shopCondition);
    /**
     * 通过shopId查询店铺
     * @param shopId
     * @return
     */
    Shop queryByShopId(long shopId);

    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
