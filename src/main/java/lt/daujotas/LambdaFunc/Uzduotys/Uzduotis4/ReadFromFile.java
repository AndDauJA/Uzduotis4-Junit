package lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4;

import lombok.ToString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ToString
public class ReadFromFile {
    public static List<Order> readDataFromFile() throws IOException {
        List<Order> orders = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/main/java/lt/daujotas/LambdaFunc/Uzduotys/Uzduotis4/duomenys.txt"))) {
            bufferedReader.lines().forEach(line -> {
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    String clientName = tokens[1];
                    double spentOnOrder = Double.parseDouble(tokens[0]);
                    orders.add(new Order(clientName, "", spentOnOrder, ""));
                }
            });
        }
        System.out.println(orders);
        return orders;
    }
}
