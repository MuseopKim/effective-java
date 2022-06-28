package chapter01.item02.illegalargumentexception;

import java.time.LocalDate;

public class Order {

    public void updateDeliveryDate(LocalDate deliveryDate) {
        LocalDate today = LocalDate.now();

        if (deliveryDate.isBefore(today)) {
            throw new IllegalArgumentException("delivery date can not be ealier than " + LocalDate.now());
        }
    }
}
