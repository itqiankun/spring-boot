package com.itqiankun.exception.handler.exception;

import com.itqiankun.exception.handler.constant.Status;
import lombok.Getter;

/**
 * <p>
 * JSON异常
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-10-02 21:18
 */
@Getter
public class JsonException extends BaseException {

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
