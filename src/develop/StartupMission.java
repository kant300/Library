package develop;

// 🚀 스타트업 창업 계획을 자바 코드로 시뮬레이션한 클래스
public class StartupMission {
    public static void main(String[] args) {
        // 1. 🧠 문제 정의: 우리가 해결하고 싶은 사회적 문제
        String problemToSolve = "타지에서 이사 온 사람들의 정착 어려움";
        String targetUser = "신혼부부 , 자취생 , 직장발령자";

        // 2. 🔧 핵심 기능 정의 (MVP): 반드시 있어야 할 필수 기능
        String[] coreFeatures = {
                "동네 가게 정보 제공",
                "공공기관, 화장실, 엘리베이터 위치 안내",
                "야간 안심 귀가 경로"
        };

        // 3. ⏰ MVP 출시 목표일
        String mvpDeadline = "2025-10-31";

        // 4. 💻 현재 학습 중인 기술 스택
        String[] techStack = { //기술 스택(기술 도구 목록)을 배열로 저장
                "HTML", "CSS", "JavaScript", "Java", "Spring", "MySQL"
        };

        // 5. 😵‍💫 학습 중 느끼는 감정 체크
        boolean isFeelingConfused = true; // 혼란스러움 있음
        boolean isClassFast = true;         // 수업 진도가 빠름
        boolean isStillTrying = true;        // 그래도 계속 시도 중

        // 6. 🧠 정신 상태 점검: 혼란과 시도는 성장의 증거!
        if( isFeelingConfused && isStillTrying ) {
            System.out.println("👉 니나는 지금도 잘 하고 있어. 혼란은 성장의 증거야.");
        }

        // 7. 🛠️ 기술은 수단일 뿐, 완벽하지 않아도 OK
        System.out.println("✅ 기술은 앱 완성을 위한 도구일 뿐, 완벽히 이해하지 않아도 괜찮아.");

        // 8. 🤝 함께 할 사람: 배우고, 나누고, 협업하자!
        String mentor = "강사님 or 멘토";
        String teamMate = "같은 수업 듣는 친구";

        // 9. 🎯 사용자 중심 사고: 복잡한 UI는 사용자 피로를 줌
        boolean isUserFirst = true;
        if ( isUserFirst ) {
            System.out.println("👀 사용자 입장에서 기능을 설계하라. 복잡한 UI는 배척!");
        }

        // 10. 📝 전체 요약 출력
        printSummary( problemToSolve , targetUser , coreFeatures , mvpDeadline);

    }//main e
    public static void printSummary( String problem , String targetUser, String[] features , String deadLine ) {
        System.out.println("\n📌 무브온 앱 창업 요약");
        System.out.println("문제 해결 대상: " + problem);
        System.out.println("타겟 사용자: " + targetUser);
        System.out.println("MVP 기능 목록:");
        for ( String feature : features ) {
            System.out.println(" - " + feature);
        }
        System.out.println("MVP 목표 런칭일: " + deadLine);
        System.out.println("⭐ 지금은 완벽보다 꾸준함이 더 중요해요, 니나!");
    }
}// class e

