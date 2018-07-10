package com.rcd.common.controller;

import com.rcd.system.domain.UserToken;
import org.springframework.stereotype.Controller;
import com.rcd.common.utils.ShiroUtils;
import com.rcd.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}