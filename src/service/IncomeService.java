package service;

import model.*;
import repository.*;

public class IncomeService {

    //
    IncomeRepository IR = new IncomeRepository();
    Income income = new Income();

    //
    public void IncomeDataProcessing(String incomeTitle, double expectedAmount, double actualAmount) {

        //
        double difference = expectedAmount - actualAmount;

        income.setIncomeTitle(incomeTitle);
        income.setExpectedAmount(expectedAmount);
        income.setActualAmount(actualAmount);
       // income.setDifference(difference);

        //
        System.out.println("Difference is R" + difference);

        boolean incomeSaved = IR.saveIncome(income);
        System.out.println(incomeSaved ? "Income Saved" : "Income Not Saved");



    }
}
