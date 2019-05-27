package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: leyou
 * @Package: com.leyou.item.pojo
 * @ClassName: Category
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 17:40
 * @Version: 1.0
 */
@Table(name="tb_category")
@Data
public class Category {
    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}
