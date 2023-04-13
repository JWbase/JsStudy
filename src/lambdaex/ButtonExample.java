package lambdaex;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();
        
        //Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(() -> System.out.println("오케이 버튼 클릭"));

        //Ok버튼 클릭하기
        btnOk.click();

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();
        
        //Cancel 버튼 객체에 람다식 주입
        btnCancel.setClickListener(() -> System.out.println("캔슬 버튼 클릭"));

        //Cancel 버튼 클릭
        btnCancel.click();
    }
}
