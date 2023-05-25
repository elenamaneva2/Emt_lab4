package mk.ukim.finki.carcatalog.domain.model;

import mk.ukim.finki.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

public class CarId extends DomainObjectId {

    private CarId() {
        super(CarId.randomId(CarId.class).getId());
    }

    public CarId(@NonNull String uuid) {
        super(uuid);
    }

    public static CarId of(String uuid) {
        CarId p = new CarId(uuid);
        return p;
    }

}
