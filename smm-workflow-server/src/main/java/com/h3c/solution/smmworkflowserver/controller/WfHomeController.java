package com.h3c.solution.smmworkflowserver.controller;

import com.h3c.solution.smmcommon.ApiResult;
import com.h3c.solution.smmcommon.ApiResultCode;
import com.h3c.solution.smmdao.User;
import com.h3c.solution.smmservice.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/workflow")
@RestController
public class WfHomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ApiResult<User> get(){
        User user = userService.get();
        ApiResult<User> result = new ApiResult<>();
        result.setCode(ApiResultCode.OK);
        result.setMessage("获取成功");
        result.setData(user);

        return result;
    }


}
