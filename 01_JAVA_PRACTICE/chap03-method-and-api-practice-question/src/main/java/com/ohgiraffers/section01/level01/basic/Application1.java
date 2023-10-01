package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        int num1=10;
        int num2=20;
        Calculator calc=new Calculator();
        calc.checkMethod();
        String str1=calc.sumTwoNumber(num1,num2);
        System.out.println(str1);

        String str2=calc.multiTwoNumber(num1,num2);
        System.out.println(str2);

        int result=calc.multiTwoNumber2(num1,num2);
        System.out.println(num1+"과 "+num2+"의 곱은 "+result+"입니다.");
    }
}
