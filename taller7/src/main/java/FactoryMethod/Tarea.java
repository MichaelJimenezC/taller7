/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import java.util.Date;

/**
 *
 * @author Michael
 */
public abstract class Tarea {
    protected String type;
    protected String description;
    protected String status;

    public Tarea(String type, String description) {
        this.type = type;
        this.description = description;
        this.status = "Not started";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    
    
    
}
