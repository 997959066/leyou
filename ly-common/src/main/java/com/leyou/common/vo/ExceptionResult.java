package com.leyou.common.vo;

/**
 * @ProjectName: leyou
 * @Package: com.leyou.common.vo
 * @ClassName: ExceptionResult
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 16:32
 * @Version: 1.0
 */
import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

@Data
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
