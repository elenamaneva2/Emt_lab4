package mk.ukim.finki.carcatalog.config;

import mk.ukim.finki.carcatalog.domain.repository.CarRepository;

import lombok.AllArgsConstructor;
import mk.ukim.finki.carcatalog.domain.model.Car;

import org.springframework.stereotype.Component;
import mk.ukim.finki.sharedkernel.domain.financial.Money;

import javax.annotation.PostConstruct;
import mk.ukim.finki.sharedkernel.domain.financial.Currency;
import org.springframework.stereotype.Component;


import java.util.Arrays;
@Component
@AllArgsConstructor
public class DataInitializer {

    private final CarRepository carRepository;

    @PostConstruct
    public void initData() {
        Car c1 = Car.build("Audi", Money.valueOf(Currency.MKD,500000), 1);
        Car c2 = Car.build("Bmw", Money.valueOf(Currency.MKD,100), 1);
        if (carRepository.findAll().isEmpty()) {
            carRepository.saveAll(Arrays.asList(c1,c2));
        }
    }
}