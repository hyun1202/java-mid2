package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전
// 1. 영어 단어와 한글 단어를 사전에 저장
// 2. 이후 단어 검색
public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("단어 입력");
        while(true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String input = sc.next();
            if (input.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String value = sc.next();
            dict.put(input, value);
        }

        System.out.println();
        System.out.println("단어 검색");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String search = sc.next();
            if (search.equals("q")) {
                break;
            }
            String result = dict.get(search);
            if (result == null) {
                System.out.println(search + "은(는) 사전에 없는 단어입니다.");
                continue;
            }
            System.out.println(search + "의 뜻: " + result);
        }
    }
}
