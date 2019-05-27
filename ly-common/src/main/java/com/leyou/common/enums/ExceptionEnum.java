package com.leyou.common.enums;

/**
 * @ProjectName: leyou
 * @Package: com.leyou.common.enums
 * @ClassName: ExceptionEnum
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 16:31
 * @Version: 1.0
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),
    CATEGORY_NOT_FIND(404, "商品分类没有查到"),
    BRAND_NOT_FOUND(404, "品牌不存在"),
    BRAND_SAVE_ERROR(404, "新增品牌失败"),
    UPLOAD_FILE_ERROR(404, "文件上传失败"),
    INVALID_FILE_TYPE(404, "无效文件类型")
            ;
    private int code;
    private String msg;
}
