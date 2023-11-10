package lt.daujotas.LambdaFunc.Uzduotys.Uzduotis4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor

public class Order {


    String klientoVardas;
    String data;
    double suma;
    String tusciaEilute;

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s\n",
                klientoVardas, data, suma, tusciaEilute);
    }


}
