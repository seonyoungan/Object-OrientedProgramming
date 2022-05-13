import java.util.Scanner;
public class Chapter_04_12 {
    public static class Menu { //예약시스템
        Scanner scanner = new Scanner(System.in);

        private String[] S = new String[10]; // 각각 10개의 좌석
        private String[] A = new String[10];
        private String[] B = new String[10];

        public void Init() {
            for (int i = 0; i < 10; i++) {
                S[i] = "---";
                A[i] = "---";
                B[i] = "---";
            }
        }

        public void SetS() {
            System.out.print("S>>");
            for (int i = 0; i < S.length; i++) {
                System.out.print(" " + S[i]);
            }
            System.out.println();
        }

        public void SetA() {
            System.out.print("A>>");
            for (int i = 0; i < A.length; i++) {
                System.out.print(" " + A[i]);
            }
            System.out.println();
        }

        public void SetB() {
            System.out.print("B>>");
            for (int i = 0; i < B.length; i++) {
                System.out.print(" " + B[i]);
            }
            System.out.println();
        }

        public void View() {
            SetS();
            SetA();
            SetB();
            System.out.println("<<<조회를 완로했습니다.>>>");
        }

        public void Reserve() {//예약
            while (true) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        SetS();
                        System.out.print("이름>>");
                        String nameS = scanner.next();
                        while (true) {
                            System.out.print("번호>>");
                            int numS = scanner.nextInt();
                            if (numS <= 0 || numS > 10) {
                                System.out.println("없는 번호입니다.");
                            } else if (S[numS - 1].equals("---")) {
                                S[numS - 1] = nameS;
                                break;
                            }else {
                                System.out.println("없는 번호입니다.");
                            }
                        }
                        break;
                    case 2:
                        SetA();
                        System.out.print("이름>>");
                        String nameA = scanner.next();
                        while (true) {
                            System.out.print("번호>>");
                            int numA = scanner.nextInt();
                            if (numA <= 0 || numA > 10) {
                                System.out.println("없는 번호입니다.");
                            } else if (A[numA - 1].equals("---")) {
                                A[numA - 1] = nameA;
                                break;
                            }else {
                                System.out.println("없는 번호입니다.");
                            }
                        }
                        break;
                    case 3:
                        SetB();
                        System.out.print("이름>>");
                        String nameB = scanner.next();
                        while (true) {
                            System.out.print("번호>>");
                            int numB = scanner.nextInt();
                            if (numB <= 0 || numB > 10) {
                                System.out.println("없는 번호입니다.");
                            } else if (A[numB - 1].equals("---")) {
                                A[numB - 1] = nameB;
                                break;
                            }else {
                                System.out.println("없는 번호입니다.");
                            }
                        }
                        break;
                    default:
                        System.out.println("없는 번호입니다.");
                }
                if(input>0 && input<4) { break; }
            }
        }
        public void Cancel(){ //취소
            while (true) {
                System.out.print("좌석 S:1, A:2, B:3>>");

                int input2 = scanner.nextInt();

                switch (input2) {
                    case 1:
                        while (true) {
                            SetS();
                            System.out.print("이름>>");
                            String nameS = scanner.next();

                            int i = 0, test = 0;
                            for (i = 0; i < 10; i++) {
                                if (nameS.equals(S[i])) {
                                    S[i] = "---";
                                    test = 1;
                                    break;
                                }
                            }
                            if (i == 10) {
                                System.out.println("예약자 명단에 이름이 존재하지 않습니다.");
                            }
                            if (test == 1) {break;}
                        }
                        break;
                    case 2:
                        while (true) {
                            SetA();
                            System.out.print("이름>>");
                            String nameA = scanner.next();
                            int i = 0, test = 0;
                            for (i = 0; i < 10; i++) {
                                if (nameA.equals(A[i])) {
                                    A[i] = "---";
                                    test = 1;
                                    break;
                                }
                            }
                            if (i == 10) {
                                System.out.println("예약자 명단에 이름이 존재하지 않습니다.");
                            }
                            if (test == 1) {
                                break;
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            SetB();
                            System.out.print("이름>>");
                            String nameB = scanner.next();
                            int i = 0, test = 0;
                            for (i = 0; i < 10; i++) {
                                if (nameB.equals(B[i])) {
                                    B[i] = "---";
                                    test = 1;
                                    break;
                                }
                            }
                            if (i == 10) {
                                System.out.println("예약자 명단에 이름이 존재하지 않습니다.");
                            }
                            if (test == 1) {
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("좌석을 선택하세요. (S:1, A:2, B:3)");
                        break;
                }
                if(input2>0 && input2<4) { break; }
            }
        }
        public static void main(String[] args) {
            System.out.println("명품 콘서트홀 예약 시스템입니다.");
            Scanner scanner = new Scanner(System.in);
            Menu sys = new Menu();
            sys.Init();

            while(true) {
                System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
                int input3 = scanner.nextInt();

                switch(input3) {
                    case 1 ://예약
                        sys.Reserve();
                        break;

                    case 2 ://조희
                        sys.View();
                        break;

                    case 3 ://취소
                        sys.Cancel();
                        break;

                    case 4 ://끝내기
                        break;
                }
                if(input3 == 4) { break; }

            }
            scanner.close();
            }
        }
    }
