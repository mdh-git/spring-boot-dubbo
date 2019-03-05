package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 *
 * 用户地址
 * @Author: madonghao
 * @Date: 2019/3/4 16:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserAddress implements Serializable{

    private Integer id;
    /** 用户地址 */
    private String userAddress;
    /** 用户id */
    private String userId;
    /** 收货人 */
    private String consignee;
    /** 电话号码 */
    private String phoneNum;
    /** 是否为默认地址    Y-是     N-否 */
    private String isDefault;
}
