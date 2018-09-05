/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author USER
 */
class LakiLaki extends Manusia{
    public LakiLaki(double TB){
        this.TinggiBadan=TB;
    }

    @Override
    public double htgbbi() {
        return((TinggiBadan - 100)-(TinggiBadan - 100) * 10/100);
    }
    
    
}
