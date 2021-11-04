package com.imooc.service.solo;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    Result<Boolean> removeShopCategory(Long shopCategoryId);
    Result<ShopCategory> queryShopCategoryById(Long shopCategoryId);
    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategory, Integer pageIndex, Integer pageSize);
}
