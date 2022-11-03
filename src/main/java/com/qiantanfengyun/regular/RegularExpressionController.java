package com.qiantanfengyun.regular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/regular-expression")
public class RegularExpressionController {

    @Autowired
    private RegularExpressionRepository regularExpressionRepository;

    @GetMapping(path = "/add")
    public @ResponseBody RegularExpression Add() {
        return regularExpressionRepository.save(new RegularExpression());
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<RegularExpression> All() {
        return regularExpressionRepository.findAll();
    }
}
