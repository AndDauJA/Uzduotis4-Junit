package lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilteredDataToFile {

    public static void getDataToFile(List<Order> list, String clientName) throws IOException {
        List<Order> clientOrdersFiltered = list.stream()
                .filter(order -> order.getKlientoVardas().equals(clientName))
                .toList();
        StringBuilder dataToWrite = new StringBuilder();

        for (Order order : clientOrdersFiltered) {
            double spentOnOrder = order.getSuma();
            System.out.println("Kliento vardas: " + clientName + ", Suma uz uzsakyma: " + spentOnOrder);
            dataToWrite.append(spentOnOrder).append(",").append(clientName).append("\n");
        }
        writeFilteredDataToFile(dataToWrite.toString());
    }

    private static void writeFilteredDataToFile(String suma) throws IOException {
        String filePath = "./src/main/java/lt/daujotas/LambdaFunc/Uzduotys/Uzduotis4/duomenys.txt";
        BufferedWriter bf = new BufferedWriter(new FileWriter(filePath, true));
        bf.write(suma);
        bf.flush();
    }
}
