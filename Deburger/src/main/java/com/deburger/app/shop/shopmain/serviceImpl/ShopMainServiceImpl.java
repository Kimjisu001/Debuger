package com.deburger.app.shop.shopmain.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deburger.app.main.login.config.SecurityUtil;
import com.deburger.app.shop.shopmain.mapper.ShopMainMapper;
import com.deburger.app.shop.shopmain.service.ShopMainService;
import com.deburger.app.shop.shopmain.service.ShopMainVO;

@Service
public class ShopMainServiceImpl implements ShopMainService {

	private ShopMainMapper shopMainMapper;
	
	@Autowired
	ShopMainServiceImpl(ShopMainMapper shopMainMapper){
		this.shopMainMapper = shopMainMapper;
	}
		
	
	@Override
	public List<ShopMainVO> listCount() {
		// TODO Auto-generated method stub
		
		String mcode = SecurityUtil.memberCode();
		ShopMainVO shopMainVO = new ShopMainVO();
		shopMainVO.setStoreNumber(mcode);
		
		return shopMainMapper.listCount(shopMainVO);
	}
	
	@Override
	public List<ShopMainVO> shopSellG(ShopMainVO shopMainVO) {
		// TODO Auto-generated method stub
		String mcode = SecurityUtil.memberCode();
		shopMainVO.setStoreNumber(mcode);
		return shopMainMapper.shopSellG(shopMainVO);
	}
	
	@Override
	public List<ShopMainVO> shopOrderG(ShopMainVO shopMainVO) {
		// TODO Auto-generated method stub
		String mcode = SecurityUtil.memberCode();
		shopMainVO.setStoreNumber(mcode);
		
		return shopMainMapper.shopOrderG(shopMainVO);
	}
	
	@Override
	public List<ShopMainVO> limitList( ) {
		// TODO Auto-generated method stub
		
		ShopMainVO shopMainVO = new ShopMainVO();
		
		String mcode = SecurityUtil.memberCode();
		shopMainVO.setStoreNumber(mcode);
		return shopMainMapper.limitList(shopMainVO);
	}
}
