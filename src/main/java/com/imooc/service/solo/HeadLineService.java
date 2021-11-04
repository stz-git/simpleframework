package com.imooc.service.solo;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);
    Result<Boolean> modifyHeadLine(HeadLine headLine);
    Result<Boolean> removeHeadLine(Long headLineId);
    Result<HeadLine> queryHeadLineById(Long headLineId);
    Result<List<HeadLine>> queryHeadLine(HeadLine headLine, Integer pageIndex, Integer pageSize);
}
