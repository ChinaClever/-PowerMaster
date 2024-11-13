import request from '@/config/axios'

// pdu历史数据 API
export const EnergyConsumptionApi = {
  // 查询pdu数据参数类型各id最大值
  getTypeMaxValue: async () => {
    return await request.get({ url: `/pdu/eq-data/type-max-value`})
  },

  // 查询pdu电量数据分页
  getEQDataPage: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/page`, params })
  },

  // 导出pdu能耗趋势历史数据 Excel
  exportEQPageData: async (params, axiosConfig) => {
    return await request.download({ url: `/pdu/eq-data/export-excel`, params, ...axiosConfig })
  },
    // 导出pdu能耗排名历史数据 Excel
    exportOutletsPageData: async (params, axiosConfig) => {
      return await request.download({ url: `/pdu/eq-data/outlets-details-excel`, params, ...axiosConfig })
    },

   // 查询pdu电量费数据分页
   getBillDataPage: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/bill-page`, params })
  },

  // 查询pdu电量数据详情
  getEQDataDetails: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/details`, params })
  },

  // 导出pdu电费统计历史数据 Excel
  exportBillPageData: async (params, axiosConfig) => {
    return await request.download({ url: `/pdu/eq-data/bill-export-excel`, params, ...axiosConfig })
  },

  // 查询pdu各输出位电量数据详情
  getOutletsEQData: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/outlets-details`, params })
  },

  // 查询pdu实时电量数据分页
  getRealtimeEQDataPage: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/realtime-page`, params })
  },

  // 导出pdu电能记录历史数据 Excel
  exportRealtimeEQPageData: async (params, axiosConfig) => {
    return await request.download({ url: `/pdu/eq-data/realtime-export-excel`, params, ...axiosConfig })
  },

  // 查询pdu能耗导航的新增多少条记录数据
  getNavNewData: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/new-data`, params })
  },

  // 查询pdu电能记录导航的一天数据显示
  getNavOneDayData: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/one-day`, params })
  },
  
  // 获取分段电能电费
  getSubBillDetails: async (params: any) => {
    return await request.get({ url: `/pdu/eq-data/bill-details`, params})
  },

    // 获取实时电量
    getEleTotalRealtime: async (params: any) => {
      return await request.post({ url: `/pdu/eq-data/ele_total_realtime`, params })
    },

      // 获取实时电量 Excel
      getEleTotalRealtimeExcel: async (params, axiosConfig) => {
    return await request.download({ url: `/pdu/eq-data/ele_total_realtimeExcel`, params, ...axiosConfig})
  },
  
}
