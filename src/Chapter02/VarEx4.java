package src.Chapter02;

// 변수란? 변수의 선언과 저장
public class VarEx4 {
    public static void main(String[] args) {
        int x = 4, y =2;
        int tmp;

        tmp = x; // 1. x의 값을 tmp에 저장
        x = y; // 2. y의 값을 x에 저장
        y =tmp; // 3. tmp의 값을 y에 저장

        System.out.println("x = " + x);
        System.out.println("y = " +y);
    }
}
