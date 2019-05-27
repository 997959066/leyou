package com.leyou.item.mapper;

/**
 * @ProjectName: leyou
 * @Package: com.leyou.item.mapper
 * @ClassName: BrandMapper
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 18:25
 * @Version: 1.0
 */
import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
public interface BrandMapper extends Mapper<Brand> {
    /**
     * 新增商品分类和品牌中间表数据
     * @param cid
     * @param bid
     * @return
     */
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid}, #{bid})")
    int insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);
}
