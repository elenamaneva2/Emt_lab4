package mk.ukim.finki.carcatalog.domain.services.form;

import lombok.Data;
import mk.ukim.finki.sharedkernel.domain.financial.Money;

@Data
public class CarForm {

    private String carBrand;
    private Money price;
    private int sales;
}

