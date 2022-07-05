package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_테스트() {
//        // 과정 1 : 작동 확인
//        int a = 10 + 5;
//        assertEquals(15, a);
//        // 코드 실행 값(-> 두번째 변수)이 예상값(-> 첫번째 변수)과 같은지 확인

        // 과정 2 : Calculator 생성
        int rs = Calculator.add("10 + 20");
        assertEquals(30, rs); // 위 함수가 정상 실행되었을 때 예상값
    }

    @Test
    public void 더하기_테스트_2() {
        // 과정 3 : 테스트 추가 생성
        int rs = Calculator.add("20 + 20");
        assertEquals(40, rs); // 위 함수가 정상 실행되었을 때 예상값
    }
}
