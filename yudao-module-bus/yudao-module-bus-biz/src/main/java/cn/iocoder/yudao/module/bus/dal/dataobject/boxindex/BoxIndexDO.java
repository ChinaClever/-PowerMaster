package cn.iocoder.yudao.module.bus.dal.dataobject.boxindex;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 始端箱索引 DO
 *
 * @author clever
 */
@TableName("bus_index")
@KeySequence("bus_index_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoxIndexDO {

    /**
     * id
     */
    @TableId
    private Integer id;
    /**
     * 设备识别码
     */
    private String devKey;
    /**
     * ip地址
     */
    private String ipAddr;
    /**
     * 母线地址
     */
    private String casAddr;
    /**
     * 母线编号
     */
    private Integer barId;
    /**
     * 运行状态 0：正常 1：预警 2：告警 3: 升级 4：故障 5：离线
     */
    private Integer runStatus;
    /**
     * 节点IP
     */
    private String nodeIp;
    /**
     * 逻辑删除
     */
    private Integer isDeleted;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 最后更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}