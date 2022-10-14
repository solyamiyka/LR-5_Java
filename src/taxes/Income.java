package taxes;

public class Income {

    private String nameOfIncome;
    private double sizeOfIncome;

    public double sizeOfTax;
    public double percentageOfTax;

    public Income(){}

    public String getNameOfIncome() {
        return nameOfIncome;
    }

    public void setNameOfIncome(String nameOfIncome) {
        this.nameOfIncome = nameOfIncome;
    }

    public double getSizeOfIncome() {
        return sizeOfIncome;
    }

    public void setSizeOfIncome(double sizeOfIncome) {
        this.sizeOfIncome = sizeOfIncome;
    }

    public double getSizeOfTax() { return sizeOfTax; }

    public void setSizeOfTax(double sizeOfTax) {
        this.sizeOfTax = sizeOfTax;
    }

    public double getPercentageOfTax() {
        return percentageOfTax;
    }

    public void setPercentageOfTax(double percentageOfTax) {
        this.percentageOfTax = percentageOfTax;
    }
}
