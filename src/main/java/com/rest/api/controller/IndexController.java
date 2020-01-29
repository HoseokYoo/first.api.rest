package com.rest.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping(value = "/index/string")
    @ResponseBody
    public String indexString() {
        return "hello world";
    }

    @GetMapping(value="/index/json")
    @ResponseBody
    public Index IndexJson () {
        Index index = new Index();
        index.message = "OK OK";
        return index;
    }

    @GetMapping(value="/index/list/{id}")
    @ResponseBody
    public Index[] ListJson (@PathVariable String id) {
        Index index = new Index();
        index.message = id;

        Index[] indexes = new Index[1];
        indexes[0] = index;
        return indexes;
    }



    @Setter
    @Getter
    public static class Index {
        private String message;
    }
}
