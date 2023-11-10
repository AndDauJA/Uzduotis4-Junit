package lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListoOfClients {

   public  static List<Order> clientOrders = new ArrayList<>();

    public static void addToListClients(Order order) throws IOException {

        clientOrders.add(order);
    }

    public static List<Order> clientList() throws IOException {
        addToListClients(new Order("Andrius", "2023-02-02", 4.44, " "));
        addToListClients(new Order("Jonas", "2023-02-03", 25, " "));
        addToListClients(new Order("Andrius", "2023-02-04", 3.33, " "));

        return clientOrders;
    }


}
