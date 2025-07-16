package Library.model.dao;

import Library.controller.MemberController;
import Library.model.dto.LoanDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class LoanDao {
    // 1) 싱글톤
    private LoanDao() {
    }

    private static final LoanDao instance = new LoanDao();

    public static LoanDao getInstance() {
        return instance;
    }

    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList<LoanDto> loanDB = new ArrayList<>();

    // 4) 도서대출 bookLoan()
    public boolean bookLoan(int bCode) {
        int lCode = loanDB.size() + 1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String loanDate = formatter.format(LocalDateTime.now());

        String returnDate = null;
        int mCode = MemberController.returnmCode();
        LoanDto loanDto = new LoanDto(lCode, bCode, mCode, loanDate, returnDate); //mCode, loanDate , returnDate
        // loanDB를 순회해서 반납일이 null이면 대출가능, null아니면 대출불가
        for( int i = 0; i < loanDB.size() ; i++ ) {
            LoanDto loan = loanDB.get( i );
            if( loan.getReturnDate()!= null ) {
                return false;
            }
        }
        loanDB.add( loanDto );
        return true;
    }// func e
}