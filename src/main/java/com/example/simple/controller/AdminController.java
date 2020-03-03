package com.example.simple.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.simple.common.Result;
import com.example.simple.common.ResultGenerator;
import com.example.simple.entity.Person;
import com.example.simple.service.NoticeService;
import com.example.simple.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class AdminController {
    @Autowired
    NoticeService noticeService;

    @Autowired
    PersonService personService;

    @GetMapping("/test")
    public Result test() {
        return ResultGenerator.genSuccessResult("Hello, Congratulation");
    }

    @GetMapping("/getPerson")
    public Result getPerson(@RequestParam("id") int id) {
        Person person = personService.getPerson(id);
        return ResultGenerator.genSuccessResult(person);
    }

    @GetMapping("/addPerson")
    public Result addPerson() {
        Person person = personService.addPerson();
        return ResultGenerator.genSuccessResult(person);
    }

    @PostMapping("/updatePerson")
    public Result updatePerson(@RequestBody String json) {
        Person person = JSONObject.parseObject(json, Person.class);
        personService.updatePerson(person);
        return ResultGenerator.genSuccessResult("ok");
    }

    @GetMapping("/savePoetry")
    public Result savePoetry() {
        return ResultGenerator.genSuccessResult();
    }
}
