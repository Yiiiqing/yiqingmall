package com.yiqing.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yiqing.mall.product.entity.BrandEntity;
import com.yiqing.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("Huawei yyds");
//        brandEntity.setName("Huawei");
//        brandService.save(brandEntity);
//        System.out.println("save success");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity entity : list) {
            System.out.println(entity);
        }
    }
}