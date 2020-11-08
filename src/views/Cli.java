package views;

import controllers.BankController;

import java.util.ArrayList;
import java.util.Scanner;

public class Cli {
    BankController bank = new BankController();

    public void start() {

        Scanner input = new Scanner(System.in);
        while (true) {
            String command = input.nextLine();
            if (command.equals("")) {
                break;
            } else if (command.equals("RC")) {
                ArrayList<String> list = new ArrayList<String>();
                System.out.println("nome de cliente:");
                String name = input.nextLine();
                list.add(name);
                System.out.println("tipo de Documento:");
                String docType = input.nextLine();
                list.add(docType);
                System.out.println("numero de identificação civil:");
                String docNum = input.nextLine();
                list.add(docNum);
                System.out.println("data de nascimento:");
                String docBD = input.nextLine();
                list.add(docBD);
                System.out.println("morada:");
                String address = input.nextLine();
                list.add(address);
                System.out.println("email:");
                String email = input.nextLine();
                list.add(email);
                System.out.println("contacto telefonico:");
                String phoneNumber = input.nextLine();
                list.add(phoneNumber);

                if (bank.hasClient(docNum) != true) {
                    bank.registerClient(list);
                    System.out.println("Cliente registado com sucesso.");
                } else {
                    System.out.println("Cliente existente, registo falhado.");
                }
            } else if (command.equals("AC")) {

            } else if (command.equals("NC")) {

            } else if (command.equals("M")) {

            } else if (command.equals("SC")) {

            } else {
                System.out.println("Instrução inválida.");
            }
        }
        input.close();
    }
}
