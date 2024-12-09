package cn.iocoder.yudao.module.bus.controller.admin.busindex.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Schema(description = "管理后台 - 始端箱索引 Response VO")
@Data
@ExcelIgnoreUnannotated
public class BusBalanceDataRes extends BusResBase {

    @Schema(description = "位置")
    private String location;

    /**
     * 设备识别码
     */
    @Schema(description = "设备识别码")
    private String devKey;

    @Schema(description = "始端箱Id")
    private Integer busId;

    @Schema(description = "A的电流")
    private Double aCur;

    @Schema(description = "B的电流")
    private Double bCur;

    @Schema(description = "C的电流")
    private Double cCur;

    @Schema(description = "A的电压")
    private Double aVol;

    @Schema(description = "B的电压")
    private Double bVol;

    @Schema(description = "C的电压")
    private Double cVol;

    @Schema(description = "电流不平衡度")
    private Double curUnbalance;

    @Schema(description = "电压不平衡度")
    private Double volUnbalance;

    @Schema(description = "负载率所在范围")
    private Integer color;

    @Schema(description = "运行状态")
    private Integer status;

    @Schema(description = "数据更新时间")
    private String dataUpdateTime;

}