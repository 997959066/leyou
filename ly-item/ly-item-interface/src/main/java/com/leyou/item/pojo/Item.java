package com.leyou.item.pojo;
import lombok.Data;
/**
 * @ProjectName: leyou
 * @Package: om.leyou.item.pojo
 * @ClassName: Item
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 16:05
 * @Version: 1.0
 */

@Data
public class Item {
    private Integer id;
    private String name;
    private Long price;
}
