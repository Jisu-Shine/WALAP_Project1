import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int selected = 1;
        while (true){
            System.out.println("=========menu=========");
            System.out.println("\t 1. 도서 추가");
            System.out.println("\t 2. 도서 조회");
            System.out.println("\t 3. 도서 수정");
            System.out.println("\t 4. 도서 삭제");
            System.out.println("\t 5. 도서명 검색");
            System.out.println("\t 6. 독서 상태 검색");
            System.out.println("======================");

            System.out.printf("실행할 작업의 번호를 입력하세요 : ");
            selected = s.nextInt();

            switch (selected) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default :
                    System.out.println("프로그램을 종료합니다. 좋은 하루 보내세요 :) ");
                    System.exit(0);
            }
            System.out.println();
        }

    }
}