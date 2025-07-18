package Library.view;

import Library.controller.LoanController;

import java.util.Scanner;

public class LoanView {
    // 1) 싱글톤
    private LoanView(){}
    private static final LoanView instance = new LoanView();
    public static LoanView getInstance(){
        return instance;
    }

    // 2) controller 싱글톤 가져오기
    private LoanController loanController = LoanController.getInstance();

    private Scanner scan = new Scanner( System.in );

    public void index() {
        for ( ; ; ) {
            System.out.println("================== 로그인 후 메뉴 =================");
            System.out.println(" 1.도서등록|2.도서대출|3.도서반납|4.내대출현황|5.도서목록|6.로그아웃");
            System.out.println("=========================================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if( choose == 2 ) {
                bookLoan();
            }
        }
    }// func e

    // 3) 도서 대출 구현
        // 1. 안내와 입력받기
    public void bookLoan() {
    System.out.println("---도서 대출--- ");
        System.out.println("대출할 도서 번호 : ");
        int bCode = scan.nextInt();
        // 2. controller에게 입력받은 값 인수로 전달후 결과(리턴)받기
        boolean result = loanController.bookLoan( bCode );
        // 3. 결과/리턴 따른 출력문
        if ( result ) {
            if (result) {
               // System.out.printf("[안내]%s \n" + "도서 대출이 완료되었습니다. " , bName);
            } else {
                System.out.println("[경고] 도서 대출을 할수 없습니다. ");
            }
        }





    }


}//class e
