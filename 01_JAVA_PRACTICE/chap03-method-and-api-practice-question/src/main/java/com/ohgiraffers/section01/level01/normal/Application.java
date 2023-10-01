package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
        System.out.print("가위바위보 : ");
        System.out.println(RandomMaker.rockPaperScissors());
        System.out.print("동전 던지기 : ");
        System.out.println(RandomMaker.tossCoin());


    }

}
