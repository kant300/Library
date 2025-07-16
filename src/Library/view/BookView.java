package Library.view;

import Library.controller.BookController;
import Library.model.dto.BookDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    // 1) 싱글톤
    private BookView() {
    }

    private static final BookView instance = new BookView();

    public static BookView getInstance() {
        return instance;
    }

    // 2) controller 싱글톤 가져오기
    private BookController bookController = BookController.getInstance();

    private Scanner scan = new Scanner(System.in);

    // 최초화면
    public void index() {
        for (; ; ) {
            System.out.println("================ 로그인 후 메뉴(admin 일경우) ===============");
            System.out.println(" 1.도서등록|2.도서대출|3.도서반납|4.내대출현황|5.도서목록|6.로그아웃");
            System.out.println("=========================================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if (choose == 1) {
                bookRegis();
            } else if (choose == 2) {
                LoanView.getInstance().bookLoan();
            }
        }//for e
    } // func e

    // 3) 도서 등록 구현
    // 1. 안내와 입력받기
    public void bookRegis() {
        System.out.println("---도서 등록--- ");
        System.out.println("도서명 : ");
        String bName = scan.next();
        System.out.println("저자 : ");
        String bAuthor = scan.next();
        // 2. controller에게 입력받은 값 인수로 전달후 결과(리턴)받기
        boolean result = bookController.bookRegis(bName, bAuthor);
        // 3. 결과/리턴 따른 출력문
        if (result) {
            System.out.printf("[안내] %s \n" + "도서 등록이 완료되었습니다. ", bName);
        } else {
            System.out.println("[경고] 도서 등록을 할수 없습니다. ");
        }
    }
}//class e
