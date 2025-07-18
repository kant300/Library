package develop;

public class ToDo {
    // 1. 클래스 멤버 변수(속성)
    // **main 메서드 안에 두면 지역 변수(local variable)**가 되어버려서, 클래스 내 다른 메서드에서 접근할 수 없어.
    String[] wins = {   // 문자열 배열 객체를 선언하고 초기화
            "1. 자바 수업 빠르게 따라가려 노력함",
            "2. 앱 MVP 구상에 집중함",
            "3. 포기하지 않고 수업 계속 들음"
    };// 배열 초기화 문장이므로 세미콜론(;)으로 마무리
    // 1. 클래스 멤버 변수(속성)
    String[] nextSteps = {
            "1. 로그인/회원가입 기능 구현 연습",
            "2. 사용자 요구 정리해서 와이어프레임 만들기",
            "3. 수업내용 중 헷갈리는 부분 ChatGPT랑 다시 복습하기"
    };
    // 2. 클래스 메소드(행동)
    public void printTasks() {
        System.out.println("=== 지금까지 잘한 점 ===");
        for ( String win : wins ) { //배열 wins 안에 있는 각각의 String 타입 요소들을 win이라는 이름으로 하나씩 꺼내어 반복문을 실행하라."
            System.out.println(win); // 각 잘한 점을 한 줄씩 출력
        }
        System.out.println("\n=== 앞으로 할 일 ===");// 빈 줄과 함께 다음 제목 출력
        for ( String step : nextSteps ) {
            System.out.println(step);
        }
    } // func e

    public static void main(String[] args) {
        ToDo todo = new ToDo(); //객체생성
        todo.printTasks();// 객체 메소드 호출

    }// main e

}// class e
