/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal4.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author namhee
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "travel")
public class Travel {

    @Id
    @Column(name = "id_travel")
    private Integer id;

    @Column(name = "nama_supir", nullable = false)
    private String namaSupir;

    @Column(name = "no_telp", nullable = false)
    private String noTelp;

    @Column(name = "alamat", nullable = false)
    private String alamat;

    @Column(name = "no_polisi", nullable = false)
    private String noPolisi;

}
