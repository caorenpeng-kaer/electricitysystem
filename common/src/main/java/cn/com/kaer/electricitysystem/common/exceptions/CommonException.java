package cn.com.kaer.electricitysystem.common.exceptions;

import cn.com.kaer.electricitysystem.common.enums.ReturnMessage;
import lombok.Getter;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Getter
public class CommonException extends RuntimeException {
    private Integer code;

    private String errorMsg;

    public CommonException(Integer code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public CommonException(ReturnMessage returnMessage){
        this.code=returnMessage.getCode();
        this.errorMsg=returnMessage.getErrorMsg();
    }
}
