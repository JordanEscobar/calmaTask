package com.jordan.calmatask.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordan.calmatask.Entity.UsuarioEntity;
import com.jordan.calmatask.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public List<UsuarioEntity> getAllUsuarios() {
        return userRepository.findAll();
    }

}
