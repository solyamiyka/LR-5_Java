package menu;

import taxes.Taxes;

public class MenuDefineSum implements MenuItem {

    private Taxes taxes;

    public MenuDefineSum(Taxes taxes) {
        this.taxes = taxes;
    }

    @Override
    public void execute(){
        taxes.defineSumTaxes();
    }
}