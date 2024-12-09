package cn.iocoder.yudao.module.bus.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {

    ErrorCode INDEX_NOT_EXISTS = new ErrorCode(11111246, "始端箱索引不存在");

    ErrorCode CURBALANCE_COLOR_NOT_EXISTS = new ErrorCode(11111247, "母线不平衡度颜色不存在");

    ErrorCode BOX_CURBALANCE_COLOR_NOT_EXISTS = new ErrorCode(11111248, "插接箱不平衡度颜色不存在");

    ErrorCode STATIS_CONFIG_NOT_EXISTS = new ErrorCode(11111249, "母线计算服务配置不存在");

    ErrorCode DC_CONFIG_NOT_EXISTS = new ErrorCode(11111250, "母线数据采集配置不存在");
}
