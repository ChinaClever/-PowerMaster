package cn.iocoder.yudao.module.room.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {

    ErrorCode INDEX_NOT_EXISTS = new ErrorCode(11111246, "机房索引不存在");

    ErrorCode CURBALANCE_COLOR_NOT_EXISTS = new ErrorCode(11111247, "机房不平衡度颜色不存在");

    ErrorCode BOX_CURBALANCE_COLOR_NOT_EXISTS = new ErrorCode(11111248, "机房不平衡度颜色不存在");

    ErrorCode STATIS_CONFIG_NOT_EXISTS = new ErrorCode(11111249, "机房计算服务配置不存在");
}
