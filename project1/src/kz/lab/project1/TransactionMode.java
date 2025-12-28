package kz.lab.project1;

public enum TransactionMode {
    MODE1 {
        @Override
        public String complete(String transactionId, boolean success) {
            return ApiService.getInstance()
                    .completeMode1(transactionId, success);
        }
    },

    MODE2 {
        @Override
        public String complete(String transactionId, boolean success) {
            return ApiService.getInstance()
                    .completeMode2(transactionId, success);
        }
    };

    public String start(String cardNumber, long amount) {
        return ApiService.getInstance()
                .start(cardNumber, amount);
    }

    public abstract String complete(String transactionId, boolean success);

}
