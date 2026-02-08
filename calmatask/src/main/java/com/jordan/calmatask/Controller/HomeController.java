package com.jordan.calmatask.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.jordan.calmatask.Entity.TareaEntity;
import com.jordan.calmatask.Service.TareaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @Autowired
    private TareaService tareaS;

    public HomeController(TareaService tareaS) {
        this.tareaS = tareaS;
    }

    @GetMapping("/")
    public List<TareaEntity> index(){
        return tareaS.getAll();
    }

}
