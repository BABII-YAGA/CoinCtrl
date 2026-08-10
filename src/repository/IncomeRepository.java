package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.*;

public class IncomeRepository {

    private DBConnection incomeConnection = new DBConnection();


    public boolean saveIncome(Income income) {

        String saveIncome = "INSERT INTO income (Income_Source, Expected_Amount, Actual_Amount, Difference, income_date) VALUES (?, ?, ?, ?, ?)";


        try(Connection conn = incomeConnection.getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(saveIncome)){

            /*

            */

            //
            preparedStatement.setString(1,income.getIncomeTitle());
            //
            preparedStatement.setDouble(2,income.getExpectedAmount());
            //
            preparedStatement.setDouble(3, income.getActualAmount());
            //
            preparedStatement.setDouble(4, income.getDifference());
            //
            preparedStatement.setDate(5, java.sql.Date.valueOf(income.getIncomeDate()));

            int income_rows = preparedStatement.executeUpdate();

            return income_rows > 0;





        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }


}
