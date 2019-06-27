package com.tedu.sp09.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;
@Component
public class ItemFeignServiceFB implements ItemFeignService {

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法获取商品数据!");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		// TODO Auto-generated method stub
		return JsonResult.err("商品出库失败!");
	}

}
