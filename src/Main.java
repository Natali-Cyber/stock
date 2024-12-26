import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        NetUtils netUtils = new NetUtils();

        List<Stock> stocks = netUtils.getStocks();

        stocks.sort(Comparator.comparingDouble(Stock::getValue));

        System.out.println("Самая дешевая акция была на " +
                stocks.get(0).getDate() + " со стоимостью " +
                stocks.get(0).getValue());

        System.out.println("Самая дорогая акция была на " +
                stocks.get(stocks.size() - 1).getDate() + " со стоимостью " +
                stocks.get(stocks.size() - 1).getValue());
    }
}