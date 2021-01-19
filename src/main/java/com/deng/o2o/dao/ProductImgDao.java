package com.deng.o2o.dao;

import com.deng.o2o.entity.ProductImg;

import java.util.List;

public interface ProductImgDao {
    int batchInsertProductImg(List<ProductImg> productImgList);

    int deleteProductImgByProductId(long productId);

    List<ProductImg> queryProductImgList(long productId);
}
