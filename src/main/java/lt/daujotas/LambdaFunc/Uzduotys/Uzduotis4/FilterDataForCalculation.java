package lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4;

import lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4.Order;

import java.util.List;

import static lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4.ListoOfClients.clientOrders;

public class FilterDataForCalculation {
    public static int getSum(List<Order> filteredOrder,String clientName) {
        double suma = clientOrders.stream()
                .filter(order -> order.getKlientoVardas().equals(clientName))
                .mapToDouble(Order::getSuma)
                .sum();
        double roundedSum = Math.round(suma * 100.0) / 100.0;

        List<String> expenseDates = clientOrders.stream()
                .filter(order -> order.getKlientoVardas().equals(clientName))
                .map(Order::getData)
                .toList();
        System.out.println("Kleinto vardas: " + clientName + " Islaidu data: " + expenseDates + "Suma: " + roundedSum);
        return 0;
    }

}
