/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.oussamar.samar;

/**
 *
 * @author samar
 */
public class PlateauJeu {

    private String[][] plateau ;
    
    
    
    
    public PlateauJeu() {
        plateau = new String[12][4];
    }
    
    public void setColor(int row, int col, String couleur) {
        plateau[row][col] = couleur ;
    }

    public String getColor(int row, int col) {
        return plateau[row][col];
    }
    
    
    public void Manche(){
         
        
        
    
    
    }
    
}
