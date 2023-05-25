package mk.ukim.finki.carcatalog.domain.valueobjects;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.base.ValueObject;


import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Quantity implements ValueObject {

    private final int quantity;

    protected Quantity() {
        this.quantity = 0;
    }

}

