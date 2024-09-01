package com.deburger.app.shop.stock.mapper;

import java.util.List;

import com.deburger.app.shop.stock.service.StockVO;

public interface StockMapper {
	
	//전체 조회
	  public List<StockVO> selectStock();
	  
	//장바구니 업데이트
	  public int insertCart(StockVO stockVO);
	  
	//상세 조회
	  public StockVO selectStockinfo(StockVO stockVO);

}
