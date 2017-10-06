/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelTemperaturas;
import views.ViewTemperaturas;
import controllers.ControllerTemperaturas;
/**
 *
 * @author PC14
 */
public class Main {
    public static void main(String ieod[]){
        ModelTemperaturas model_temperaturas = new ModelTemperaturas();
        ViewTemperaturas view_temperaturas = new ViewTemperaturas();
        ControllerTemperaturas controller_temperaturas = new ControllerTemperaturas(model_temperaturas, view_temperaturas);
    }
}
