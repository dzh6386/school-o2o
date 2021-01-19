package com.deng.o2o.dao;

import com.deng.o2o.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCategoryDao {
    List<ProductCategory> queryProductCategoryList(long shopId);

    /**
     * 批量新增商品类别
     * @param productCategoryList
     * @return
     */
    int batchInsertProductCategory(List<ProductCategory> productCategoryList);

    /**
     * 根据传来的productCategoryId和shopId删除指定的productCategory
     * @param productCategoryId
     * @param shopId
     * @return
     * 由于有两个参数，mybatis无法识别参数，所以要加@param
     */
    int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);

}
