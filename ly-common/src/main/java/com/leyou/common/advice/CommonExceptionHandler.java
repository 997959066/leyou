package com.leyou.common.advice;

/**
 * @ProjectName: leyou
 * @Package: com.leyou.common.advice
 * @ClassName: CommonExceptionHandler
 * @Author: ZSH9440
 * @Description: ${description}
 * @Date: 2019/5/27 16:35
 * @Version: 1.0
 */
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
