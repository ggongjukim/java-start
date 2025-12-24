package method;

public class Overloading {
    public static void main(String[] args) {

        //오버로딩 규칙**
        //메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환 타입은 인정하지 않는 다.
        //다음 케이스는 메서드 이름과 매개변수의 타입이 같으므로 컴파일 오류가 발생한다. 반환 타입은 인정하지 않는다.
        // 오버로딩 성공
//        add(int a, int b);
//        add(int a, int b, int c);
//        add(double a, double b);


        // 오버로딩 실패
//        int add(int a, int b)
//        double add(int a, int b)

    }

    public static void add(int a, int b){
        int sumNum = a+b;
        return;
    }

    public static void add(int a, int b, int c){
        int sumNum = a+b+c;
        return;
    }

    public static void add(double a, double b){
        double sumNum = a+b;
        return;
    }

}


//반환 타입이 명시된 메서드에서 조건문(if)의 결과에 따라 `return` 문이 실행되지 않을 가능성이 있다면 어떤 문제가 발생할까요? > 컴파일 에러 발ㅊ
//메서드 정의 시 괄호 안에 선언되어 메서드로 전달되는 값을 받아오는 역할을 하는 변수를 매개변수라고 합니다. 호출 시 넘기는 실제 값은 인자라고 하죠.