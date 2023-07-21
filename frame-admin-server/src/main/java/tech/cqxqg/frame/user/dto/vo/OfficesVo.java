package tech.cqxqg.frame.user.dto.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class OfficesVo {
    private Integer id;

    /**
     * 办公室名称
     */
    private String name;

    /**
     * 办公室地址
     */
    private String address;

    /**
     * 简介
     */
    private String intro;

    /**
     * 简介md
     */
    private String introMd;

    /**
     * 办公人员数量
     */
    private Integer countWorkers;

    /**
     * 工位数量
     */
    private Integer countStations;

    /**
     * 状态 D-删除 N-正常 W-待审核 A-审核通过
     */
    private String status;
}
