package com.wgc.petstore.controller;

import com.wgc.petstore.dao.PetMapper;
import com.wgc.petstore.dao.PhotoMapper;
import com.wgc.petstore.dao.TagMapper;
import com.wgc.petstore.entity.Pet;
import com.wgc.petstore.entity.Photo;
import com.wgc.petstore.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetstoreController {

    @Autowired
    private PetMapper petMapper;

    @Autowired
    private PhotoMapper photoMapper;

    /*通过查询宠物*/
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String selectAll(Model model) {
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pet", pets);
        return "pet";
    }
    /*名字查询*/
    @GetMapping("/name/{name}")
    public String selectName(@PathVariable("name") String name, Model model) throws UnsupportedEncodingException {
        //String encode = URLEncoder.encode(name, "utf-8");
        Pet pet = petMapper.selectName(name);
        model.addAttribute("pet", pet);
        return "pet_page";
    }

    /*批量添加宠物*/
    @RequestMapping(value = "/batchAdd", method = RequestMethod.POST)
    public String batchAdd(Pet pets) {
        int i = petMapper.batchAdd(pets);
        return "redirect:/pet/query";
    }


    /*修改宠物*/
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(Pet pet) {
        int i = petMapper.updateByPrimaryKey(pet);
        return "redirect:/pet/query";
    }



    /*通过标签查询宠物*/
    @RequestMapping(value = "/tagQuery", method = RequestMethod.GET)
    public String tagQuery(@RequestParam(name = "name") String name, Model model) {
        List<Pet> pets = petMapper.selectTagName("%"+name+"%");
        model.addAttribute("pet", pets);
        return "pet";
    }

    /*删除宠物*/
    @RequestMapping(value = "/delete/{id}")
    public String delPet(@PathVariable("id") int id) {
        int i = petMapper.deleteByPrimaryKey(id);
        return "redirect:/pet/query";
    }

    @GetMapping("/pet/add")
    public String obtainPage() {
        return "pet_add";
    }

    @RequestMapping(value = "/photo/add", method = RequestMethod.POST)
    public String addPhoto(Photo photo) {
        int insert = photoMapper.insert(photo);
        return "redirect:/pet/query";
    }
}
