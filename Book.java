/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author ADMIN
 */
public class Book {
    private String Name;
    private int Qty;

    

    public Book(String Name) {
        this.Name = Name;
        this.Qty =  ( int)((Math.random()*5)+2);
        
      
    }
    
    public String getName(){
        return this.Name;
    }

    public int getQty() {
        return Qty;
    }
    
    public void setQty(){
        this.Qty--;
    }
    
    
}
