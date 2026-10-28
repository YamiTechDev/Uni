public class GetCreditForClient {
    interface BankWorker {
        boolean checkClientForCredit(BankClient client);
    }


    class getCreditForClient(BankWorker worker, BankClient client) throws BadCreditHistoryException, ProblemWithLawException {
    try{return worker.checkClientForCredit(client);}
    catch(BadCreditHistoryException e){
        System.out.println("«Проблемы с банковской историей»");
    }
    catch(ProblemWithLawException e){
        return false;
    }
    finally{
        System.out.println("Проверка завершена");
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
}