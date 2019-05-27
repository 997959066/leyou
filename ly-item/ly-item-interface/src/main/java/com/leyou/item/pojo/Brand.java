package com.leyou.item.pojo;

/**
 * @ProjectName: leyou
 * @Package: com.leyou.item.pojo
 * @ClassName: Brand
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 18:24
 * @Version: 1.0
 */
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_brand")
@Data
public class Brand {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;// 品牌名称
    private String image;// 品牌图片
    private Character letter;
}
