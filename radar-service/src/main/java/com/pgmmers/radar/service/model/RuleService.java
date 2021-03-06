package com.pgmmers.radar.service.model;

import com.pgmmers.radar.dal.bean.RuleHistoryQuery;
import com.pgmmers.radar.dal.bean.RuleQuery;
import com.pgmmers.radar.service.common.CommonResult;
import com.pgmmers.radar.vo.model.RuleVO;

import java.util.List;

public interface RuleService {

    List<RuleVO> listRule(Long activationId);

    RuleVO get(Long id);

    CommonResult query(RuleQuery query);

    CommonResult save(RuleVO rule, String merchantCode);

    CommonResult delete(Long[] id);

    CommonResult getHitSorts(Long modelId);
    
    CommonResult queryHistory(RuleHistoryQuery query);
    
    List<RuleVO> listRuleByModelId(Long modelId);
}
