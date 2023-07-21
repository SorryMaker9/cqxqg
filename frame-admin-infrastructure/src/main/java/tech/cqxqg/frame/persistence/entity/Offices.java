package tech.cqxqg.frame.persistence.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 办公室表
 * </p>
 *
 * @author feng
 * @since 2023-07-21
 */
@Data
@TableName("offices")
public class Offices implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 办公室ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 办公室名称
     */
    @TableField("name")
    private String name;

    /**
     * 办公室地址
     */
    @TableField("address")
    private String address;

    /**
     * 简介
     */
    @TableField("intro")
    private String intro;

    /**
     * 简介md
     */
    @TableField("intro_md")
    private String introMd;

    /**
     * 办公人员数量
     */
    @TableField("count_workers")
    private Integer countWorkers;

    /**
     * 工位数量
     */
    @TableField("count_stations")
    private Integer countStations;

    /**
     * 状态 D-删除 N-正常 W-待审核 A-审核通过
     */
    @TableField("status")
    @TableLogic(value = "N",delval = "D")
    private String status;

    /**
     * 创建用户
     */
    @TableField("created_user_id")
    private Integer createdUserId;

    /**
     * 更新用户
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
