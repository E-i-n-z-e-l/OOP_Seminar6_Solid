package solid.srp.models;
/*
Ввод данных пользователем
 */
import java.util.Scanner;

public class FactoryCreator {

    public Order inputFromConsole(){                                        // Ввод данных пользователем;
        return new Order(prompt("Client name: "),
                      prompt("Product: "),
                      Integer.parseInt(prompt("Quantity: ")),
                      Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
