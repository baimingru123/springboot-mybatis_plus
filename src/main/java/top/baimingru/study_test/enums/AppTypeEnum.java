package top.baimingru.study_test.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author bmr
 * @time 2019-12-21 15:28
 */
@Getter
@AllArgsConstructor
public enum  AppTypeEnum {
    WECHAT(1,"微信"),
    ALIPAY(2,"支付宝"),
    APP(3,"app");

    private int code;
    private String message;
}
