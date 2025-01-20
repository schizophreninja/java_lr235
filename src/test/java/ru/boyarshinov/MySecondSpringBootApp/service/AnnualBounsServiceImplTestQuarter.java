package ru.boyarshinov.MySecondSpringBootApp.service;

import org.junit.jupiter.api.Test;
import ru.boyarshinov.MySecondSpringBootApp.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBounsServiceImplTestQuarter {

    @Test
    void calculateQuarter() {
        // given
        Positions position = Positions.TL;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        // test
        double result = new AnnualBounsServiceImpl().calculateQuarter(position, salary, bonus, workDays);

        // exp
        double expected = 192592.59259259258;
        assertThat(result).isEqualTo(expected);
    }
}