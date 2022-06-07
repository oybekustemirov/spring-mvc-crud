package org.example.controller;

import org.example.entity.Sinf;
import org.example.repository.SinfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sinf")
public class SinfController {
    @Autowired
    SinfRepository sinfRepository;

    @GetMapping("/allSinf")
    public ModelAndView getAll(ModelAndView mv){
        List<Sinf> sinfList = sinfRepository.read();
        mv.addObject("listSinf", sinfList);
        mv.setViewName("readClass");
        return mv;
    }

    @GetMapping("/addSinf")
    public ModelAndView getAddPage(ModelAndView mv) {
        mv.setViewName("createClass");
        return mv;
    }

    @PostMapping("/addSinf")
    public ModelAndView saveSinf(@ModelAttribute("sinf") Sinf sinf, ModelAndView mv){
        int num = sinfRepository.create(sinf);

        if(num == 0) {
            mv.addObject("sinf", "Class qo'shishda xatolik");
        } else {
            mv.addObject("sinf", "Sinf added!");
        }
        mv.setViewName("createClass");
        return mv;
    }

    @GetMapping("/updateSinf/{id}")
    public ModelAndView getUpdatePage(@PathVariable Integer id, ModelAndView mv){
        Sinf sinfById = sinfRepository.findSinfById(id);
        List<Sinf> sinfList = new ArrayList<>(List.of(sinfById));
        mv.addObject("sinf", sinfList);
        mv.setViewName("updateClass");
        return mv;

    }

    @PostMapping("/updateSinf")
    public ModelAndView updateSinf(@ModelAttribute Sinf sinf, ModelAndView mv) {
        int counter = sinfRepository.update(sinf);

        if (counter > 0) {
            mv.addObject("msg", "Class records updated against class id" + sinf.getId());
        } else {
            mv.addObject("msg", "Error - check the concol log.");
        }
        mv.setViewName("updateClass");
        return mv;
    }

    @GetMapping("/deleteSinf/{id}")
    public ModelAndView deleteSinf(@PathVariable Integer id, ModelAndView mv) {

        int counter = sinfRepository.delete(id);

        if (counter > 0) {
            mv.addObject("msg", "Class records deleted against class id: " + id);
        } else {
            mv.addObject("msg", "Error- check the console log.");
        }

        mv.setViewName("deleteClass");

        return mv;
    }


}
