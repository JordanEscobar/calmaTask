package com.jordan.calmatask.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.jordan.calmatask.Entity.TareaEntity;
import com.jordan.calmatask.Entity.UsuarioEntity;
import com.jordan.calmatask.Service.TareaService;
import com.jordan.calmatask.Service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @Autowired
    private TareaService tareaS;

    private UsuarioService userS;

    public HomeController(TareaService tareaS,UsuarioService userS) {
        this.tareaS = tareaS;
        this.userS = userS;
    }

    @GetMapping("/tareas")
    public List<TareaEntity> index(){
        return tareaS.getAll();
    }


    @GetMapping("/usuarios")
    public List<UsuarioEntity> getAllUsers(){
        return userS.getAllUsuarios();
    }

}
