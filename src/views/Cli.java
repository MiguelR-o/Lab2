package views;

import controllers.BankController;

import java.util.ArrayList;
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
                ArrayList<String> list = new ArrayList<String>();
                Scanner secondLine = new Scanner(System.in);
                System.out.println("nome de cliente:");
                String name = secondLine.nextLine();
                list.add(name);
                System.out.println("tipo de Documento:");
                String docType = secondLine.nextLine();
                list.add(docType);
                System.out.println("numero de identificação civil:");
                String docNum = secondLine.nextLine();
                list.add(docNum);
                System.out.println("data de nascimento:");
                String docBD = secondLine.nextLine();
                list.add(docBD);
                System.out.println("morada:");
                String address = secondLine.nextLine();
                list.add(address);
                System.out.println("email:");
                String email = secondLine.nextLine();
                list.add(email);
                System.out.println("contacto telefonico:");
                String phoneNumber = secondLine.nextLine();
                list.add(phoneNumber);

                if (bank.hasClient(docNum) != true) {
                    bank.registerClient(list);
                    System.out.println("Cliente registado com sucesso.");
                } else {
                    System.out.println("Cliente existente, registo falhado.");
                }
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
