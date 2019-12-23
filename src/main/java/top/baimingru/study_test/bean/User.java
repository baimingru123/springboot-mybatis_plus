package top.baimingru.study_test.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author bmr
 * @time 2019-12-21 15:05
 */
@Data
@TableName("user")
public class User extends Model {

    @TableId
    private Integer id;

    @TableField("member_id")
    private Integer memberId;

    private BigDecimal balance;

    private String openid;

    @TableField("app_type")
    private Integer appType;

    private String realname;

    @TableField("id_card")
    private String idCard;

    private String nick;

    private String country;

    private String province;

    private String city;


}
