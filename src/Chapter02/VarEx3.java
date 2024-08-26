package src.Chapter02;

// 리터럴의 타입과 접미사
public class VarEx3 {
    public static void main(String[] args) {
        final int score = 100;
        // score = 200;
        boolean power = true;
        // boolean power = false;
        System.out.println(power);

        byte b = 127; // -128 ~ 127

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16
        System.out.println(oct);
        System.out.println(hex);

        long l = 10_000_000_000L;
        float f = 3.14f;
        double d = 3.14f; // 생략 가능

        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);

        char ch = 'A'; // ''에는 하나의 문자만 들어가야 함
        int i = 'A';
        System.out.println(ch);
        System.out.println(i);

        String str = ""; // 빈 공백도 괜찮음
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(""+7+7); // 77
        System.out.println(7+7+""); // 14
    }
}
