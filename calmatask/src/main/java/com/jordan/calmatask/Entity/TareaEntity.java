package com.jordan.calmatask.Entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarea")
public class TareaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "energia")
    private String energia;
    @Column(name = "estado")
    private String estado;
    @Column(name= "fecha")
    @JsonFormat(pattern ="dd-MM-yyyy")
    private LocalDate fecha;

    public TareaEntity(Integer id, String titulo, String descripcion, String energia, String estado, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.energia = energia;
        this.estado = estado;
        this.fecha = fecha;
    }

    public TareaEntity(){

    }

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

        public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

        public String getEnergia(){
        return energia;
    }

    public void setEnergia(String energia)
    {
        this.energia = energia;
    }

        public String getEstado(){
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }


    



}
