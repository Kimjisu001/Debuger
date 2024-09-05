package com.deburger.app.office.container.service;

import java.util.List;

public interface ContainerService {

	// 전체 조회
	public List<ContainerVO> containerAllList();

	// 상세 조회
	public List<ContainerVO> containerInfo(ContainerVO containerVO);

	// 등록
	public int containerInsert(ContainerVO containerVO);

	// 물류 창고 입고 조회
	public List<ContainerVO> containerAllInList();

	// 물류 창고 입고 처리 조회
	public List<ContainerVO> containerInInfo(List<ContainerVO> list);

	// 물류 창고 폐기 조회
	public List<ContainerVO> containerDtInfo(ContainerVO containerVO);

	// 물류 창고 폐기 처리
	public int disposeItem(ContainerVO containerVO);

}
