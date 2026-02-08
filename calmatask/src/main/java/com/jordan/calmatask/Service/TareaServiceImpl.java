package com.jordan.calmatask.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jordan.calmatask.Entity.TareaEntity;
import com.jordan.calmatask.Repository.TareaRepository;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    private TareaRepository tareaRepo;

    @Override
    public List<TareaEntity> getAll() {
        return tareaRepo.findAll();
    }

    
}
