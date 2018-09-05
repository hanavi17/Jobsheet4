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
class singa extends hewan{

    @Override
    void setNama() {
        String singa = "Diablo";
        System.out.println("Nama singa: "+singa);
    }

    @Override
    void setSuara() {
        String suara = "Roaaarrrr";
        System.out.println("Suara Singa: "+suara);
    }

    @Override
    void setBerat() {
        double berat = 10.0;
        System.out.println("Berat Singa: "+berat+" kg");
    }
    
}
