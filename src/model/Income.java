package model;


import java.time.LocalDate;

public class Income {


private String  IncomeTitle;
private double ExpectedAmount;
private double ActualAmount;
private double difference;
private LocalDate IncomeDate;


public Income() {
    this.IncomeTitle = IncomeTitle;
    this.ExpectedAmount = ExpectedAmount;
    this.ActualAmount = ActualAmount;
    this.difference = difference;
    this.IncomeDate = LocalDate.now();
}


// Getters and Setters
    public String getIncomeTitle() {return  IncomeTitle;}
    public void setIncomeTitle(String IncomeTitle) {this.IncomeTitle = IncomeTitle;}

    public double getExpectedAmount() {return  ExpectedAmount;}
    public void setExpectedAmount(double ExpectedAmount) {this.ExpectedAmount = ExpectedAmount;}

    public double getActualAmount() {return  ActualAmount;}
    public void setActualAmount(double ActualAmount) {this.ActualAmount = ActualAmount;}

    public double getDifference() {return  difference;}
    public void setDifference(double Difference) {this.difference = difference;}

    public LocalDate getIncomeDate() {return  IncomeDate;}
    public void setIncomeDate(LocalDate IncomeDate) {this.IncomeDate = IncomeDate;}


}
