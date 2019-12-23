package top.baimingru.study_test.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author bmr
 * @time 2019-12-21 15:23
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {
    ON_LOAN(1,"租借中"),
    HAS_COMPLETED(2,"已完成"),
    CANCEL(3,"撤销"),
    TIME_OUT(4,"超时");

    private int code;
    private String message;


}
