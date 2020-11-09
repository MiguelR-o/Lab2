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
                ArrayList<String> list = new ArrayList<String>();
                System.out.println("Id de cliente a atualizar:");
                String clientId = input.nextLine();
                if (bank.hasClient(clientId) == true) {

                    System.out.println("novo tipo de Documento:");
                    String docType = input.nextLine();
                    list.add(docType);
                    System.out.println("nova morada:");
                    String address = input.nextLine();
                    list.add(address);
                    System.out.println("novo email:");
                    String email = input.nextLine();
                    list.add(email);
                    System.out.println("novo contacto telefonico:");
                    String phoneNumber = input.nextLine();
                    list.add(phoneNumber);

                    bank.updateClient(clientId, list);
                    System.out.println("Dados atualizados com sucesso.");

                } else {
                    System.out.println("Cliente inexistente.");
                }

            } else if (command.equals("NC")) {
                System.out.println("Numero de identificação de cliente:");
                String clientId = input.nextLine();
                if (bank.hasClient(clientId) == true) {
                    System.out.println("ID de Conta ?");
                    int accountID = input.nextInt();
                    input.nextLine();
                    System.out.println("Deposito inicial?");
                    String answer = input.nextLine();
                    if (answer.equals("S")) {
                        System.out.println("Quantidade?");
                        String amount = input.nextLine();
                        bank.registerAccount(clientId, accountID, Double.parseDouble(amount));
                        System.out.println("Conta criada com sucesso.");

                    } else if (answer.equals("N")) {
                        bank.registerAccount(clientId, accountID, 0);
                        System.out.println("Conta criada com sucesso.");
                    }
                } else {
                    System.out.println("Cliente inexistente.");
                }

            } else if (command.equals("M")) {
                System.out.println("Numero de identificação de cliente:");
                String clientId = input.nextLine();
                if (bank.hasClient(clientId) == true) {
                    System.out.println("ID da conta:");
                    int accountID = input.nextInt();
                    input.nextLine();
                    if (bank.hasAccount(accountID) == true) {
                        System.out.println("Operação:");
                        String answer = input.nextLine();
                        if (answer.equals("debito")) {
                            System.out.println("Quantidade:");
                            double amount = input.nextDouble();
                            input.nextLine();
                            bank.debit(clientId, accountID, amount);
                            System.out.println("Operação completa.");

                        } else if (answer.equals("credito")) {
                            System.out.println("Quantidade:");
                            double amount = input.nextDouble();
                            input.nextLine();
                            bank.credit(clientId, accountID, amount);
                            System.out.println("Operação completa.");

                        } else {
                            System.out.println("Operação inválida.");
                        }

                    } else {
                        System.out.println("Conta inexistente.");
                    }

                } else {
                    System.out.println("Cliente inexistente.");
                }

            } else if (command.equals("SC")) {
                System.out.println("ID de cliente:");
                String clientId = input.nextLine();
                if (bank.hasClient(clientId) == true) {
                    System.out.println("ID de conta:");
                    int accountID = input.nextInt();
                    input.nextLine();
                    System.out.println("Saldo:" + bank.getBalance(clientId, accountID));
                } else {
                    System.out.println("Cliente inexistente.");
                }
            } else {
                System.out.println("Instrução inválida.");
            }
        }
        input.close();
    }
}
