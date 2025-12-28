import kz.lab.project1.TransactionMode;

void main() {
    IO.println("Project1...");


    String cardNumber = "4111111111111111";
    long amount = 100;
    for (TransactionMode mode : TransactionMode.values()) {

        String txId = mode.start(cardNumber, amount);
        String result = mode.complete(txId, true);

        System.out.println(mode + " result = " + result);
    }
}
