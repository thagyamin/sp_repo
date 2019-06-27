package com.tedu.sp09.service;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;
@Component
public class UserFeignServiceFB implements UserFeignService {

	@Override
	public JsonResult<User> getUser(Integer userId) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法获取用户数据!");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		// TODO Auto-generated method stub
		return JsonResult.err("用户新增积分失败");
	}

}
