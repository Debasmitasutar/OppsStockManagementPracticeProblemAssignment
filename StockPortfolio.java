package StockAccountManagement;

import java.util.ArrayList;

public class StockPortfolio {
    public static void main(String[] args) {
        StockPortf p = new StockPortf();
        StockPortf.Stock st= p.new Stock();
        st.company="Reliance";
        st.noOfShare=5;
        st.price=500.79;
        p.port.add(st);

        //Add second company
        StockPortf.Stock st2= p.new Stock();
        st2.company="Bigbasket";
        st2.noOfShare=3;
        st2.price=50.79;
        p.port.add(st2);

        for (int i = 0; i < p.port.size(); i++) {
            System.out.println("Total stock price:"+p.TotalStockPrice()+" of "+p.port.get(i).company+".");
        }
    }
}


/*
 * Class for storing values
 */
class StockPortf {
    int noOfStock = 0;
    ArrayList<Stock> port = new ArrayList<Stock>();
    double totalValue = 0;

    //creating user defined datatype as class
    public class Stock {
        int noOfShare;
        String company;
        double price;
    }

    //Declaring function to calculate total stock price
    public double TotalStockPrice() {
        for (int i = 0; i < port.size(); i++) {
            //continous addition
            totalValue += port.get(i).price * port.get(i).noOfShare;
        }
        return totalValue;
    }
}





