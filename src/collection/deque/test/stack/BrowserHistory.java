package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        // 이전 페이지를 history에 저장
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
