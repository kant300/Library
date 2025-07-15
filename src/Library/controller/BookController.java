package Library.controller;

import Library.model.dao.BookDao;

public class BookController {
    // 1) 싱글톤
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){
        return instance;
    }
    // 2) dao 싱글톤 가져오기
    private BookDao bookDao = BookDao.getInstance();

    // 3) 도서등록 bookRegis()
    public boolean bookRegis( int bCode , String bName, String bAuthor ) {
        boolean result = false;
        // 1) dao에게 매개변수를 전달하고 결과값을 받는다.
        result = bookDao.bookRegis( bCode , bName, bAuthor );
        return result;
    }


    // 4) 도서대출 bookLoan()


}