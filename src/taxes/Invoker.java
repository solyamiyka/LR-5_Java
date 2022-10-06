package taxes;

import menu.MenuItem;

public class Invoker {
    private MenuItem defSet;
    private MenuItem defSum;
    private MenuItem search;
    private MenuItem sort;

    public Invoker(MenuItem defSet, MenuItem defSum, MenuItem search, MenuItem sort) {
        this.defSet = defSet;
        this.defSum = defSum;
        this.search = search;
        this.sort = sort;
    }

    public void defineSetTaxes(){

        defSet.execute();
    }
    public void defineSumTaxes(){

        defSum.execute();
    }
    public void sortTaxes(){

        sort.execute();
    }
    public void searchTaxes(){

        search.execute();
    }

}