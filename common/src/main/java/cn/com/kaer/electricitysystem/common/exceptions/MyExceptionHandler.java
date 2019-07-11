package cn.com.kaer.electricitysystem.common.exceptions;

import cn.com.kaer.electricitysystem.common.entity.SysResult;
import cn.com.kaer.electricitysystem.common.enums.ReturnMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public SysResult exceptionHandlers(Exception e) {
        if (e instanceof CommonException) {
            return SysResult.fail(((CommonException) e).getCode(), ((CommonException) e).getErrorMsg());
        } else {
            return SysResult.fail(ReturnMessage.SERVER_IS_ERROR.getCode(), ReturnMessage.SERVER_IS_ERROR.getErrorMsg());
        }
    }
}
