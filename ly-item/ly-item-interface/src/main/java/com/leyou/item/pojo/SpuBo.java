package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Transient;
import java.util.List;

/**
 * @ClassName SpuBo
 * @Description TODO
 * @Author 99795
 * @DaTe 2019/5/27 23:07
 * @Version 1.0
 **/
@Data
public class SpuBo extends Spu {

    @Transient
    String cname;// 商品分类名称
    @Transient
    String bname;// 品牌名称
    @Transient
    SpuDetail spuDetail;// 商品详情
    @Transient
    List<Sku> skus;// sku列表
}


