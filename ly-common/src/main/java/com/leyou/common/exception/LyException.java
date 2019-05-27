package com.leyou.common.exception;
import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
/**
 * @ProjectName: leyou
 * @Package: com.leyou.common.exception
 * @ClassName: LyException
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 16:33
 * @Version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException{
    private ExceptionEnum exceptionEnum;
}
