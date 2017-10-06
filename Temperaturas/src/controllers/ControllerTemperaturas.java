/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelTemperaturas;
import views.ViewTemperaturas;
/**
 *
 * @author PC14
 */
public class ControllerTemperaturas {
    ModelTemperaturas model_temperaturas;
    ViewTemperaturas view_temperaturas;
    
    public ControllerTemperaturas( ModelTemperaturas model_temperaturas,  ViewTemperaturas views_temperaturas){
        this.model_temperaturas = model_temperaturas;
        this.view_temperaturas = views_temperaturas;
        view_temperaturas.jbtn_agregar.addActionListener(e-> jbtn_agregar_click());
        view_temperaturas.jbtn_asc.addActionListener(e-> jbtn_asc_click());
        view_temperaturas.jbtn_promedio.addActionListener(e-> jbtn_promedio_click());
        initViews();
    }
    
    public void initViews(){
        view_temperaturas.jtf_temp.setText(String.valueOf(model_temperaturas.getTemp()));
        view_temperaturas.j_list.setText(String.valueOf(model_temperaturas.getVariable()));
        model_temperaturas.ordenar();
        view_temperaturas.setVisible(true);
    }
    
    
    
    
}
