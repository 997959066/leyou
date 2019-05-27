package com.leyou.item.mapper;

import com.leyou.item.pojo.Spu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName SpuMapper
 * @Description TOOD
 * @Author 99795
 * @DaTe 2019/5/27 23:11
 * @Version 1.0
 **/
public interface SpuMapper extends Mapper<Spu> {
    /**
     * 新增商品分类和品牌中间表数据
     * @param cid
     * @param bid
     * @return
     */

}

