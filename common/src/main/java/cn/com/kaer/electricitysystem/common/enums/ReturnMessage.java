package cn.com.kaer.electricitysystem.common.enums;

import lombok.Getter;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Getter
public enum ReturnMessage {
    PARAMS_IS_EMPTY(101, "请输入正确参数"),
    SERVER_IS_ERROR(102,"服务器开小差了,正在紧急修复中..."),
    ;
    private Integer code;

    private String errorMsg;

    ReturnMessage(Integer code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }
}
