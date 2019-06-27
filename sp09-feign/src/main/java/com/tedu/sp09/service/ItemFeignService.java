package com.tedu.sp09.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;

//通知指定服务id,可知向哪台主机来转发调用
//两台 8001 8002
@FeignClient(name = "item-service",fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {
	
	/*
	 * Feign 利用Spring MVC注解,
	 * 来反向生成访问路径
	 * 
	 * 根据Mapping中指定的路径,在主机地址狗拼接路径
	 * 
	 * 根据@PathVariable配置,把参数拼接到路径中
	 * 
	 * 向拼接的路径,来转发调用
	 */
	@GetMapping("/{orderId}")
	JsonResult<List<Item>> getItems(@PathVariable String orderId);
	
	@PostMapping("/decreaseNumber")
	JsonResult decreaseNumber(@RequestBody List<Item> items);
}
