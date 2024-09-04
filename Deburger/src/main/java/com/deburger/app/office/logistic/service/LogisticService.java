package com.deburger.app.office.logistic.service;

import java.util.List;
import java.util.Map;

public interface LogisticService {
		
		//믈류창고 전체조회
		public List<LogisticVO> logisticList();
		//물류창고 단건조회
		public List<LogisticVO> logisticInfo(LogisticVO logisticVO);
		//물류창고 물품조회
		public List<LogisticVO> logisticMaterialInfo(LogisticVO logisticVO);
		
		//물류창고 등록
		public int insertLogistic(LogisticVO logisticVO);
		//물류창고 수정
		public Map<String, Object> updateLogistic(LogisticVO logisticVO);
		//물류창고 삭제
		public int deleteLogistic(String logisticsId);
		
}