package collection.deque.test.stack;

// BrowserHistory 클래스 완성
// visitPage(): 특정 페이지 방문
// goBack(): 뒤로 가기
public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}
