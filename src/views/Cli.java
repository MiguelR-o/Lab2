package views;

import controllers.BankController;
import java.util.Scanner;

public class Cli {
    BankController bank = new BankController();

    public void start() {

        while (true) {
            Scanner input = new Scanner(System.in);
            String[] words = input.nextLine().split(" ");
            if (input.nextLine() == "") {
                break;
            } else if (words[0] == "RC") {
                while(true){
                    Scanner secondLine = new Scanner(System.in);
                    String[] word2 = input.nextLine().s
                }
                bank.registerClient();
            } else if (words[0] == "AC") {

            } else if (words[0] == "NC") {

            } else if (words[0] == "M") {

            } else if (words[0] == "SC") {

            } else {
                System.out.println("Instrução inválida.");
            }
        }
    }
}
