package sunghun;

import java.util.Scanner;
import java.util.Vector;

class GraphicEditor {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        String n;
        Vector<String> graphic = new Vector<String>();
        Shape l = new Line();
        Shape r = new Rect();
        Shape c = new Circle();


        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            n = scanner.nextLine();

            if(n.equals("1")) {
                System.out.print("Line(1), Rect(2), Circle(3) >> ");
                String m = scanner.nextLine();

                switch(m) {
                    case "1":
                        graphic.add(l.draw());
                        break;

                    case "2":
                        graphic.add(r.draw());
                        break;

                    case "3":
                        graphic.add(c.draw());
                        break;
                }
            }

            if(n.equals("2")) {
                System.out.print("삭제할 도형의 위치 >> ");
                int m = scanner.nextInt();
                if(m <1){
                    System.out.println("1보다 큰수를 입력해주세요");
                }else {
                    if(graphic.size()>=m){
                        graphic.remove(m-1);
                    }else
                        System.out.println("삭제할 수 없습니다.");
                }

            }

            if(n.equals("3")) {
                for(int i=0; i<graphic.size(); i++) {
                    System.out.println(graphic.get(i));
                }
            }

            if(n.equals("4")) {
                System.out.println("beauty을 종료합니다.");
                break;
            }
        }

    }
}