package menu;

import taxes.Taxes;

public class MenuSearchTaxes implements MenuItem{

    private Taxes taxes;

    public MenuSearchTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    @Override
    public void execute(){
        taxes.searchTaxes();
    }

}