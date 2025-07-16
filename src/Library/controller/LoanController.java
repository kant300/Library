package Library.controller;

import Library.model.dao.LoanDao;

public class LoanController {
    // 1) 싱글톤
    private LoanController(){}
    private static final LoanController instance = new LoanController();
    public static LoanController getInstance(){
        return instance;
    }

    // 2) dao 싱글톤 가져오기
    private LoanDao loanDao = LoanDao.getInstance();

    // 3) 도서대출 bookLoan()
    public boolean bookLoan( int bCode ) {
        boolean result = false;
        // 1) dao에게 매개변수를 전달하고 결과값을 받는다.
        result = loanDao.bookLoan( bCode );
        return result;

    }

}// class e