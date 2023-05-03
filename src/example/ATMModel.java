package example;

import kz.edu.nu.JavaSim.Model;
import kz.edu.nu.JavaSim.connection.Bool;
import kz.edu.nu.JavaSim.connection.Connection;

public class ATMModel {

    public static void main(String[] args) {
        Model ATMModel = new Model();

        // Create the connections between the components
        Connection<Bool> start              = new Connection<>("start", new Bool(true));
        Connection<Bool> cardInserted       = new Connection<>("cardInserted", new Bool(false));
        Connection<Bool> correctPass        = new Connection<>("correctPass", new Bool(false));
        Connection<Bool> wrongPass          = new Connection<>("wrongPass", new Bool(false));
        Connection<Bool> cancel             = new Connection<>("cancel", new Bool(false));
        Connection<Bool> amountReq          = new Connection<>("amountReq", new Bool(false));
        Connection<Bool> cashReq            = new Connection<>("cashReq", new Bool(false));
        Connection<Bool> operationDone      = new Connection<>("operationDone", new Bool(false));
        Connection<Bool> anotherOperation   = new Connection<>("anotherOperation", new Bool(false));
        Connection<Bool> cardTaken          = new Connection<>("cardTaken", new Bool(false));

        // Create the components
        StartingDisplay startingDisplay = new StartingDisplay("Starting Display");
        startingDisplay.addIncomingConnection(start);
        startingDisplay.addIncomingConnection(cardTaken);
        startingDisplay.addOutgoingConnection(cardInserted);

        PasswordRequest passwordRequest = new PasswordRequest("Password Request");
        passwordRequest.addIncomingConnection(cardInserted);
        passwordRequest.addOutgoingConnection(correctPass);
        passwordRequest.addOutgoingConnection(wrongPass);

        MainMenu mainMenu = new MainMenu("Main Menu");
        mainMenu.addIncomingConnection(correctPass);
        mainMenu.addIncomingConnection(anotherOperation);
        mainMenu.addOutgoingConnection(cancel);
        mainMenu.addOutgoingConnection(amountReq);
        mainMenu.addOutgoingConnection(cashReq);

        AmountRequest amountRequest = new AmountRequest("Amount Request");
        amountRequest.addIncomingConnection(amountReq);
        amountRequest.addOutgoingConnection(operationDone);
        amountRequest.addOutgoingConnection(anotherOperation);

        CashRequest cashRequest = new CashRequest("Cash Request");
        cashRequest.addIncomingConnection(cashReq);
        cashRequest.addOutgoingConnection(operationDone);
        cashRequest.addOutgoingConnection(anotherOperation);

        CardEjected cardEjected = new CardEjected("Card Ejected");
        cardEjected.addIncomingConnection(wrongPass);
        cardEjected.addIncomingConnection(cancel);
        cardEjected.addIncomingConnection(operationDone);
        cardEjected.addOutgoingConnection(cardTaken);


        // Add the components to the model
        ATMModel.addComponent(startingDisplay);
        ATMModel.addComponent(passwordRequest);
        ATMModel.addComponent(mainMenu);
        ATMModel.addComponent(amountRequest);
        ATMModel.addComponent(cashRequest);
        ATMModel.addComponent(cardEjected);

        // Run the model
        int numCycles = 0;
        while (numCycles < Model.MAX_NUM_CYCLES) {
            numCycles++;
            ATMModel.runCycle();
            // Check if the simulation is over
            if ( (cardTaken.getData()).equals(true) ) {
                break;
            }
        }

        // Print the output
        System.out.println("\n-----------------------------");
        System.out.println("Simulation finished in " + (numCycles) + " cycles.");
    }
}