package com.jordan.calmatask.Service;

import java.util.List;

import com.jordan.calmatask.Entity.TareaEntity;

public interface TareaService {

    //lista todas las tareas
    List<TareaEntity> getAll();
}
