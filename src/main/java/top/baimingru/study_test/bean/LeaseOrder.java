package top.baimingru.study_test.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author bmr
 * @time 2019-12-21 15:15
 */
@Data
public class LeaseOrder extends Model {

    @TableId
    private Integer id;

    @TableField("order_no")
    private String orderNo;

    private int type;

    private int uid;

    @TableField("app_type")
    private int appType;

    @TableField("start_time")
    private LocalDateTime startTime;

    @TableField("end_time")
    private LocalDateTime endTime;

    private BigDecimal amount;

    private int status;


}
