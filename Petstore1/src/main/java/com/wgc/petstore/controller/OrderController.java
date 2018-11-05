package com.wgc.petstore.controller;

import com.wgc.petstore.dao.OrderMapper;
import com.wgc.petstore.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

/*商店表*/
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    /*查询所有的订单*/
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String selectAll(Model model) {
        List<Order> orders = orderMapper.selectAll();
        model.addAttribute("order", orders);
        return "order";
    }

    /*通过编号查询订单*/
    @RequestMapping(value = "/queryNumber/{number}", method = RequestMethod.GET)
    public String orderByParamName(@PathVariable("number") String number, Model model) {
        Order order = orderMapper.selectByNumber(number);
        model.addAttribute("order", order);
        return "order";
    }

    /*添加订单*/
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String insert(Order order) {
        int insert = orderMapper.insert(order);
        return "redirect:/petstore/query";
    }

    /*删除订单*/
    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") int id) {
        int i = orderMapper.deleteByPrimaryKey(id);
        return "redirect:/petstore/query";
    }
}
