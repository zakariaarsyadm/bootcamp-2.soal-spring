/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring.umur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author namhee
 */
@Component
public class UmurSaya {
    
    @Autowired
    UmurContainer umur;
    
    public void UmurSaya() {
        System.out.println("Saya ber usia ("+umur.getUmurContainer()+") tahun");
    }
    
}
