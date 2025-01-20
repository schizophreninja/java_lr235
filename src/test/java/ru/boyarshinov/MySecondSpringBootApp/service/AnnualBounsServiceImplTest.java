package ru.boyarshinov.MySecondSpringBootApp.service;

import org.junit.jupiter.api.Test;
import ru.boyarshinov.MySecondSpringBootApp.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBounsServiceImplTest {

    @Test
    void calculate() {
        // given
        Positions position = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        // test
        double result = new AnnualBounsServiceImpl().calculate(position, salary, bonus, workDays);

        // exp
        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }
}