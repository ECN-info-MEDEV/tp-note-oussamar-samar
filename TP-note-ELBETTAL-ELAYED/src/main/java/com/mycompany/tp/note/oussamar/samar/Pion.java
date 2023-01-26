/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.oussamar.samar;

import java.util.ArrayList;

/**
 *
 * @author samar
 */
public class Pion {
    ArrayList <String> ListCouleur=new ArrayList<>();
    String couleur;

    public Pion() {
        ListCouleur.add("J");
        ListCouleur.add("R");
        ListCouleur.add("B");
        ListCouleur.add("V");
        ListCouleur.add("B");
        ListCouleur.add("N");
        
    }
    public Pion(String couleur){
        this.couleur=couleur;
    }
    
}
