/*
Zadatak: Napraviti program za upravljanje dvama spremnicima s tekućinom. Spremnici su nazvani "prvi" i "drugi".
Svaki od njih može istodobno sadržavati maksimalu količinu od 100 litara tekućine.

Program sadrži funkcionalnost dodavanja, premještanja i uklanjanja tekućine. Faunkcionalnosti su
 kreirane kroz metode u klasi Container. Korištenjem naredbe "add", tekućina će se dodati u prvi spremnik,
 "move" će premjestiti tekućinu iz prvog spremnika u drugi spremnik,
 a "remove" će ukloniti tekućinu iz drugog spremnika.
 */


import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {


        Container first = new Container();
        Container second = new Container();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("First: " + first  );
            System.out.println("Second: " + second );

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }
             String[] parts = input.split(" ");
             int amount = Integer.valueOf(parts[1]);
            if (parts[0].equals("add") && amount > 0) {
                first.add(amount);
            }
            if (first.contains() > 100) {
                first.add(100);
            }
            if (parts[0].equals("move") && amount > 0 && second.contains() <= 100) {
                if (first.contains() >= 0) {
                    second.add(amount);
                    first.remove(amount);
                } else if (amount > first.contains()) {
                    second.add(first.contains());
                    first.add(0);
                }

                if (second.contains() > 100) {
                    second.add(100);
                }

            }
            if (parts[0].equals("remove") && amount > 0) {
                second.remove(amount);
                if (second.contains() < 0) {
                    second.add(0);
                }

            }
        }

    }
}
