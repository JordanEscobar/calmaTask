package com.jordan.calmatask.Entity;

import java.time.LocalDate;

import com.jordan.calmatask.Common.enums.Energia;
import com.jordan.calmatask.Common.enums.EstadoTarea;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tarea")
public class TareaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Column(length = 500)
    private String descripcion;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Energia energia;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoTarea estado;
    @Column( nullable = false)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id",nullable = false)
    private UsuarioEntity usuario;

    public TareaEntity(String titulo, String descripcion, Energia energia, EstadoTarea estado, LocalDate fecha,UsuarioEntity usuario) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.energia = energia;
        this.estado = estado;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    protected TareaEntity(){

    }



}
