import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        NetUtils netUtils = new NetUtils();

        List<Stock> stocks = netUtils.getStocks();

        stocks.sort(new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                Float val1 = new Float(o1.getValue());
                Float val2 = new Float(o2.getValue());
                return val1.compareTo(val2);
            }
        });

        System.out.println("Самая дешевая акция была на " +
                stocks.get(0).getDate() + " со стоимостью " +
                stocks.get(0).getValue());

        System.out.println("Самая дорогая акция была на " +
                stocks.get(stocks.size() - 1).getDate() + " со стоимостью " +
                stocks.get(stocks.size() - 1).getValue());
    }
}