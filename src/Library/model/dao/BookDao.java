package Library.model.dao;

import Library.model.dto.BookDto;
import java.util.ArrayList;

public class BookDao {
    // 1) 싱글톤
    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){
        return instance;
    }
    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList<BookDto> bookDB = new ArrayList<>();

    // 3) 도서등록 bookRegis()
    public boolean bookRegis( String bName, String bAuthor ) {
        boolean result = false;
        int bCode = bookDB.size()+1;
        // 1) 매개변수 값들을 객체화히기
        BookDto bookDto = new BookDto( bCode , bName , bAuthor );
        // 2) DB에 생성한 객체 대입하기
        bookDB.add( bookDto );
        // 3) 성공시 result 에 성공의 의미 'true' 대입
        result = true;
        return result;
    } // func e



}//class e
