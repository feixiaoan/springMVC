package com.xiaofei.exception;

/**
 * <Description> <br>
 *异常信息
 * @author 小飞<br>
 * @version 1.0<br>
 * @createDate 2019/05/27<br>
 * @see com.xiaofei.exception <br>
 */
public class SysException extends Exception{
    /**
     * 存储提示信息
     */
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
