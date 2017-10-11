/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring.umur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author namhee
 */
@Component
public class UmurContainer {

    private java.lang.Integer umur;

    public UmurContainer(@Value("20") java.lang.Integer umur) {
        this.umur = umur;
    }
    
    public java.lang.Integer getUmurContainer() {
        return umur;
    }

}
