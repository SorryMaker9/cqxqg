package tech.cqxqg.frame.user.dto.request;

import com.swak.frame.dto.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class OfficesPageReq extends PageInfo {
    /**
     * 办公室id
     */
    private Integer id;

    /**
     * 办公室名称
     */
    private String name;

    /**
     * 办公室地址
     */
    private String address;
}
