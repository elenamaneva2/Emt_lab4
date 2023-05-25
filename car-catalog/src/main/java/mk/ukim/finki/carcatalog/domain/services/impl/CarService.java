package mk.ukim.finki.carcatalog.domain.services.impl;

import mk.ukim.finki.carcatalog.domain.model.Car;
import mk.ukim.finki.carcatalog.domain.model.CarId;
import mk.ukim.finki.carcatalog.domain.services.form.CarForm;

import java.util.List;

public interface CarService {

    Car findById(CarId id);
    Car createProduct(CarForm form);
    Car orderItemCreated(CarId productId, int quantity);
    Car orderItemRemoved(CarId productId, int quantity);
    List<Car> getAll();

}