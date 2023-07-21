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
 * 办公室员工表
 * </p>
 *
 * @author feng
 * @since 2023-07-21
 */
@Data
@TableName("user_office")
public class UserOffice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 办公室ID
     */
    @TableField("office_id")
    private Integer officeId;

    /**
     * 办公用户ID
     */
    @TableField("worker_user_id")
    private Integer workerUserId;

    /**
     * 加入时间
     */
    @TableField("joined_at")
    private LocalDateTime joinedAt;

    /**
     * 离开时间
     */
    @TableField("left_at")
    private LocalDateTime leftAt;

}
