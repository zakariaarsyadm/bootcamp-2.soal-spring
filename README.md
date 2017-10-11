# Soal latihan Spring Framework

1. Jelaskan menurut pendapat anda tentang
  - Spring Framework 
  - ApplicationContect 
  - Dependency Injection 
  - Inversion of Control
  - Spring Boot
  - Spring Container
  - Bean
  - Aturan apa saja yang diterapkan oleh Spring Framework
  - Tujuan penggunaan Spring Framework
  
2. Jelaskan menurut pendapat anda tentang
  - Hibernate
  - Hibernate Dialect
  - HQL (Hibernate Query Language) dan JPQL ( Java Persistence Query Language)
  - JPA (Java Persistance API)
  - ORM
  - Domain Model
  - @Entity
  - @Table
  - @Column
  - @Id
  - @OneToOne (berikan contoh kasusnya)
  - @OneToMany (berikan contoh kasusnya)
  - @ManyToOne (berikan contoh kasusnya)
  - @ManyToMany (berikan contoh kasusnya)
  - SessionFactory dan Session
 
 3. Buat program bagaimana cara meload aplikasi spring dengan menggunakan **Java Configuration / Annotation** dan Buat sebuah bean dengan tipe data java.lang.Integer yang di beri nilai 20 kemudian buat sebuah kelas baru dengan nama `UmurSaya` dalam package `com.tabeldata.soal.spring` kemudian 
 tampilkan ke console seperti berikut `Saya ber usia (20) tahun` **nilai 20 diambil dari bean yang di deklarasikan spring container** 
 4. Buat sebuah program untuk mengkoneksikan ke database **PostgreSQL** dengan menggunakan **Spring Boot** dan **Hibernate** dan buatlah tabel berserta datanya seperti berikut:
 
 Tabel **tiket**
 
 | id (primary key) | id_penumpang (fk_penumpang) |  id_travel (fk_travel)   | jadwal             |
 | :--              | :--                         | :--                      | :--                |
 | 1                | 1                           |   1                      | 2017-10-20 10:00   |
 | 2                | 2                           |   3                      | 2017-10-20 10:00   |
 | 3                | 3                           |   2                      | 2017-10-20 10:00   |
 
 Tabel **penumpang**
 
 | id_penumpang | nama        | no_telp         | alamat              |
 |  :---        | :---        | :---            | :---                |
 | 1            | Lukman      | 0812341234213   | Jl.cisaranten       |
 | 2            | Akbar       | 0918234483343   | Jl. Melawai         |
 | 3            | Dewa Ngoman | 0900934483343   | Jl. panglima polim  |
 
 Tabel **travel**
 
 | id_travel    | nama_supir        | no_telp         | alamat              |
 |  :---        | :---              | :---            | :---                |
 | 1            | Eko               | 0813284343433   | Jl.cisaranten       |
 | 2            | Budi              | 0918234483343   | Jl. Melawai         |
 | 3            | Adi Putra         | 0900934483343   | Jl. panglima polim  |
 
 ## Cara Mengerjakan
 
 * Fork Repository ini
 * Untuk Soal no 1 dan 2 **Kerjakan di kertas polio dikumpulkan besok**
 * Untuk Soal no 3 dan 4 kerjakan di repository ini paling lambat di push **tgl 11-okt-2017 jam 15:00**
 
 
  
