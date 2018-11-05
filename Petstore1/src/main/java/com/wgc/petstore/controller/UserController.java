package com.wgc.petstore.controller;

import com.wgc.petstore.dao.UserMapper;
import com.wgc.petstore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /*用户登录的功能*/
    @GetMapping("/login")
    public String login(@RequestParam(name = "name") String name,@RequestParam(name = "password") String password) {
        User user = userMapper.selectByName(name);
        if(user.getUserName() == null) {
           // result.reject("name","账号不能为空或是正确，请重新输出");
            return "redirect:/user/login";
        }
        if (password.equals(user.getUserName())) {
            //result.reject("password","密码不能为空或是正确，请重新输出");
        }
        return "redirect:/user/query";
    }
    /*查询所有用户*/
    @GetMapping("/query")
    public String selectAll(Model model) {
        List<User> users = userMapper.selectAll();
        model.addAttribute("user", users);
        return "index";
    }

    /*用户注册的功能*/
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String registered(User user) {
        int insert = userMapper.insert(user);
        return "redirect:/user/query";
    }
    /*用户通过id查询*/
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return "";
    }
    /*用户更新的功能*/
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(User user) {
        return "";
    }
    /*删除用户的功能*/
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String del(@PathVariable("id") int id) {
        userMapper.deleteByPrimaryKey(id);
        return "redirect:/user/query";
    }
}
