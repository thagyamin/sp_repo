package com.tedu.sp09.service;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Order;
import com.tedu.web.util.JsonResult;
@Component
public class OrderFeignServiceFB implements OrderFeignService {

	@Override
	public JsonResult<Order> getOrder(String orderId) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法获取订单信息!");
	}

	@Override
	public JsonResult addOrder() {
		// TODO Auto-generated method stub
		return JsonResult.err("添加订单失败!");
	}

}
