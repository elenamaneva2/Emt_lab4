package mk.ukim.finki.carcatalog.domain.model;

import lombok.Getter;
import mk.ukim.finki.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.sharedkernel.domain.financial.Money;

import javax.persistence.*;

@Entity
@Table(name="car")
@Getter
public class Car extends AbstractEntity<CarId> {

    private String carBrand;

    private int sales = 0;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="price_amount")),
            @AttributeOverride(name="currency", column = @Column(name="price_currency"))
    })
    private Money price;

    private Car() {
        super(CarId.randomId(CarId.class));
    }


    public static Car build(String carBrand, Money price, int sales) {
        Car c = new Car();
        c.price = price;
        c.carBrand = carBrand;
        c.sales = sales;
        return c;
    }

    public void addSales(int qty) {
        this.sales = this.sales - qty;
    }

    public void removeSales(int qty) {
        this.sales -= qty;
    }
}
