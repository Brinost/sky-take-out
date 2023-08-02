package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.sky.service
 * @ClassName: ReportService
 * @author: shmily
 * @createTime: 2023/8/2 14:22
 * @version: 17
 * @Description:
 */
public interface ReportService {

    /**
     * 统计指定时间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);

}
