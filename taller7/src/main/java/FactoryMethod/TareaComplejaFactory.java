/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.TareaCompleja;
import FactoryMethod.Tarea;

/**
 *
 * @author Michael
 */
public class TareaComplejaFactory implements TareaFactory{
    @Override
    public Tarea crearTarea(String type, String description) {
        return new TareaCompleja(type, description);
    }
}
