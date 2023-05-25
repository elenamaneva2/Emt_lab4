package mk.ukim.finki.carcatalog.domain.repository;

import mk.ukim.finki.carcatalog.domain.model.Car;
import mk.ukim.finki.carcatalog.domain.model.CarId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, CarId> {
}

