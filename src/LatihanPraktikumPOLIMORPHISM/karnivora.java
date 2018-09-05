/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikumPOLIMORPHISM;

/**
 *
 * @author USER
 */
public class karnivora {
    public static void main(String[] args) {
        //Cara Penulisan Objek: (superclass) variable = new (subclass)
        System.out.println("===== HEWAN DEFAULT =====");
        hewan h = new hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("===== HEWAN KUCING =====");
        kucing k = new kucing();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("===== HEWAN SINGA =====");
        singa s = new singa();
        h.setNama();
        h.setSuara();
        h.setBerat();
    }
}
