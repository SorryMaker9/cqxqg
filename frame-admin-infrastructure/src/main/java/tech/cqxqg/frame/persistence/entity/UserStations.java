package tech.cqxqg.frame.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 办公室工位表
 * </p>
 *
 * @author feng
 * @since 2023-07-21
 */
@Data
@TableName("user_stations")
public class UserStations implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 办公室工位ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 办公室ID
     */
    @TableField("office_id")
    private Integer officeId;

    /**
     * 工位编号
     */
    @TableField("number")
    private Integer number;

    /**
     * 坐在该工位用户ID 默认为0, 没有人坐为0
     */
    @TableField("work_user_id")
    private Integer workUserId;

    /**
     * 创建用户
     */
    @TableField("created_user_id")
    private Integer createdUserId;

    /**
     * 创建时间
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 更新用户
     */
    @TableField("updated_user_id")
    private Integer updatedUserId;

    /**
     * 更新时间
     */
    @TableField("update_at")
    private LocalDateTime updateAt;

}
