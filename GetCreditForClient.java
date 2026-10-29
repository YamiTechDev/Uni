public class GetCreditForClient {
    interface BankWorker {
        boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException;

        default boolean getCreditForClient(BankWorker worker, BankClient client) {
            try {
                return worker.checkClientForCredit(client);
            } catch (BadCreditHistoryException e) {
                System.out.println("Проблемы с банковской историей");
                return false;
            } catch (ProblemWithLawException e) {
                return false;
            }


        }

        public class BadCreditHistoryException extends Exception {

            public BadCreditHistoryException() {
                super();
            }

            public BadCreditHistoryException(String message) {
                super(message);
            }
        }

        public class ProblemWithLawException extends Exception {
            public ProblemWithLawException() {
                super();
            }

            public ProblemWithLawException(String message) {
                super(message);
            }
        }

        class BankClient {
            boolean client;
        }


    }
}