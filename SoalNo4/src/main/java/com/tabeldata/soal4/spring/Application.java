package com.tabeldata.soal4.spring;

import com.tabeldata.soal4.spring.model.Penumpang;
import com.tabeldata.soal4.spring.model.Travel;
import com.tabeldata.soal4.spring.repository.PenumpangRepository;
import com.tabeldata.soal4.spring.repository.TravelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        PenumpangRepository penumpangRepository = applicationContext.getBean(PenumpangRepository.class);
        penumpangRepository.save(new Penumpang(1, "Lukman", "0812341234213", "Jl.cisaranten"));
        penumpangRepository.save(new Penumpang(2, "Akbar", "0918234483343", "Jl. Melawai"));
        penumpangRepository.save(new Penumpang(3, "Dewa Ngoman", "0900934483343", "Jl. panglima polim"));

        TravelRepository travelRepository = applicationContext.getBean(TravelRepository.class);
        travelRepository.save(new Travel(1,"Eko","0813284343433","Jl.cisaranten","D 2524 ZZC"));
        travelRepository.save(new Travel(2,"Budi","0918234483343","Jl. Melawai","B 4343 KDF"));
        travelRepository.save(new Travel(3,"Adi Putra","0900934483343","Jl. panglima polim","B 2343 DKJ"));
        
        
    }
}
