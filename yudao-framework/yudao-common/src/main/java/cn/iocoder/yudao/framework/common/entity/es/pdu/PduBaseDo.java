package cn.iocoder.yudao.framework.common.entity.es.pdu;

import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


/**
 * @Author: chenwany
 * @Date: 2024/3/29 09:20
 * @Description: 基础实体类
 */
@Data
public class PduBaseDo {

    private int id;

    @JsonProperty("pdu_id")
    private int pduId;

    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    private DateTime createTime;
}
