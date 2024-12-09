package cn.iocoder.yudao.framework.common.entity.es.pdu.loop;

import cn.hutool.core.date.DateTime;
import cn.iocoder.yudao.framework.common.entity.es.pdu.total.PduTotalBaseDo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: chenwany
 * @Date: 2024/4/3 08:59
 * @Description: 回路历史基础数据
 */
@Data
public class PduHdaLoopBaseDo extends PduTotalBaseDo {

    /**
     * 回路
     */
    @JsonProperty("loop_id")
    private int loopId;

    /**
     * 平均电压
     */
    @JsonProperty("vol_avg_value")
    private float volAvgValue;

    /**
     * 最大电压时间
     */
    @JsonProperty("vol_max_time")
    private DateTime volMaxTime;


    /**
     * 最大电压
     */
    @JsonProperty("vol_max_value")
    private float volMaxValue;

    /**
     * 最小电压时间
     */
    @JsonProperty("vol_min_time")
    private DateTime volMinTime;


    /**
     * 最小电压
     */
    @JsonProperty("vol_min_value")
    private float volMinValue;


    /**
     * 平均电流
     */
    @JsonProperty("cur_avg_value")
    private float curAvgValue;

    /**
     * 最大电流时间
     */
    @JsonProperty("cur_max_time")
    private DateTime curMaxTime;

    /**
     * 最大电流
     */
    @JsonProperty("cur_max_value")
    private float curMaxValue;

    /**
     * 最小电流时间
     */
    @JsonProperty("cur_min_time")
    private DateTime curMinTime;


    /**
     * 最小电流
     */
    @JsonProperty("cur_min_value")
    private float curMinValue;


}
