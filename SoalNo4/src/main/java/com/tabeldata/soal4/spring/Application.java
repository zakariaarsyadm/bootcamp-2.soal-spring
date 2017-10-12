package com.tabeldata.soal4.spring;

import com.tabeldata.soal4.spring.model.Penumpang;
import com.tabeldata.soal4.spring.model.Tiket;
import com.tabeldata.soal4.spring.model.Travel;
import com.tabeldata.soal4.spring.repository.PenumpangRepository;
import com.tabeldata.soal4.spring.repository.TiketRepository;
import com.tabeldata.soal4.spring.repository.TravelRepository;
import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        PenumpangRepository penumpangRepository = applicationContext.getBean(PenumpangRepository.class);
        Penumpang penumpang1 = penumpangRepository.save(new Penumpang(1, "Lukman", "0812341234213", "Jl.cisaranten"));
        Penumpang penumpang2 = penumpangRepository.save(new Penumpang(2, "Akbar", "0918234483343", "Jl. Melawai"));
        Penumpang penumpang3 = penumpangRepository.save(new Penumpang(3, "Dewa Ngoman", "0900934483343", "Jl. panglima polim"));

        TravelRepository travelRepository = applicationContext.getBean(TravelRepository.class);
        Travel travel1 = travelRepository.save(new Travel(1, "Eko", "0813284343433", "Jl.cisaranten", "D 2524 ZZC"));
        Travel travel2 = travelRepository.save(new Travel(2, "Budi", "0918234483343", "Jl. Melawai", "B 4343 KDF"));
        Travel travel3 = travelRepository.save(new Travel(3, "Adi Putra", "0900934483343", "Jl. panglima polim", "B 2343 DKJ"));

        TiketRepository tiketRepository = applicationContext.getBean(TiketRepository.class);
        tiketRepository.save(new Tiket(1, Timestamp.valueOf("2017-10-20 10:00:00"), penumpang1, travel1));
        tiketRepository.save(new Tiket(2, Timestamp.valueOf("2017-10-20 10:00:00"), penumpang2, travel3));
        tiketRepository.save(new Tiket(3, Timestamp.valueOf("2017-10-20 10:00:00"), penumpang3, travel2));

    }
}
