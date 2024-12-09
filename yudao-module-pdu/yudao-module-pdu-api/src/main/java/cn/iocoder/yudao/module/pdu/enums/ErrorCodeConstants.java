package cn.iocoder.yudao.module.pdu.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {
    ErrorCode HISTORY_DATA_NOT_EXISTS = new ErrorCode(11111234, "pdu历史数据不存在");
    ErrorCode PDU_DEVICE_NOT_EXISTS = new ErrorCode(11111235, "PDU设备不存在");

    ErrorCode DC_CONFIG_NOT_EXISTS = new ErrorCode(11111236, "pdu数据采集配置不存在");
    ErrorCode EQ_BILL_CONFIG_NOT_EXISTS = new ErrorCode(11111237, "pdu电量计费方式配置不存在");
    ErrorCode STATIS_CONFIG_NOT_EXISTS = new ErrorCode(11111238, "pdu计算服务配置不存在");

    ErrorCode CURBALANCE_COLOR_NOT_EXISTS = new ErrorCode(11111239, "PDU不平衡度颜色不存在");

}
