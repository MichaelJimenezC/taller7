/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.TareaSimple;
import FactoryMethod.TareaFactory;
import FactoryMethod.Tarea;

/**
 *
 * @author Michael
 */
public class TareaSimpleFactory implements TareaFactory{

    @Override
    public Tarea crearTarea(String type, String description) {
        return new TareaSimple(type, description);
    }
    
}
