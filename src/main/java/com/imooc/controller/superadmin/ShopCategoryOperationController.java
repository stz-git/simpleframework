package com.imooc.controller.superadmin;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;
import com.imooc.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.inject.annotation.Autowired;

import java.util.List;

@Controller
public class ShopCategoryOperationController {
    @Autowired
    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return shopCategoryService.addShopCategory(new ShopCategory());
    }

    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }

    public Result<Boolean> removeShopCategory(Long shopCategoryId) {
        return shopCategoryService.removeShopCategory(1L);
    }

    public Result<ShopCategory> queryShopCategoryById(Long shopCategoryId) {
        return shopCategoryService.queryShopCategoryById(1L);
    }

    public Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategory, Integer pageIndex, Integer pageSize) {
        return shopCategoryService.queryShopCategory(null, 1, 100);
    }
}
