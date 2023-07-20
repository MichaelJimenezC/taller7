/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.Tarea;

/**
 *
 * @author Michael
 */
public interface TareaFactory {
     Tarea crearTarea(String type, String description);
     
    
}
