package com.deng.o2o.dao;

import com.deng.o2o.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    int insertProduct(Product product);

    Product queryProductById(long productId);

    int updateProduct(Product product);

    /**
     * 查询商品列表并分页，可输入条件：商品名（模糊查询），商品状态，店铺Id，商品类别
     * @param productCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    /**
     * 因为queryProductList方法是分页，所以要有product的总数，queryProductCount方法返回的就是product的总数
     * @param productCondition
     * @return
     */
    int queryProductCount(@Param("productCondition") Product productCondition);

    /**
     * 删除商品类别之前先把商品类别的Id置为空，
     * @param productCategoryId
     * @return
     */
    int updateProductCategoryToNull(long productCategoryId);
}
