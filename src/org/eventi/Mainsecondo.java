package org.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Mainsecondo {
    public static void main(String[] args) {
        Concerto concerto = new Concerto("hello", LocalDate.parse("2024-07-03"), 500, LocalTime.parse("20:34"),new BigDecimal("34.00"));

        System.out.println(concerto);
    }
}
