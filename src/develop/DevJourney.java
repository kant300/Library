package develop;

public class DevJourney {

    private int daysOfStudy = 45;       // 공부한 일수
    private boolean skillImproved = false;  // 실력은 늘었는지 여부(false = 아직...)
    private boolean projectIsAMess = true;  // 프로젝트 상태 ( true = 정신없음 )
    private boolean feedbackIsHarsh = true; // 받은 피드맥이 냉정한지 여부

    public void statusReport() {    // 현재 상태 리포트 출력
        System.out.println("앱개발 공부 시작한 지" + daysOfStudy + "일이 지났습니다.");

        // 실력이 안 늘었을때 메시지
        if ( !skillImproved ) {
            System.out.println( "실력은... 안 늘었어요.  \uD83D\uDE2D");
        }
        // 프로젝트가 엉망일 때 메시지
        if ( projectIsAMess ) {
            System.out.println("프로젝트는 엉망이에요. \uD83E\uDDE8");
        }
        // 피드백이 냉정할때 메시지
        if( feedbackIsHarsh ) {
            System.out.println("평가는 냉정하네요. \uD83E\uDD76");
        }

        // 그러나 나는 포기하지 않음!
        System.out.println("그래도 나는 포기하지 않아요. \uD83D\uDD25");
    } // func e

    //프로그램 시작점
    public static void main(String[] args) {
        //나의 개발 여정을 객체로 생성
        DevJourney myJourney = new DevJourney();

        // 현재 상태 리포트 출력 실행
        myJourney.statusReport();
    }//main e
}// class e
