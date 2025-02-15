package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> browserHistory = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String string) {
        if (currentPage != null) {
            browserHistory.push(currentPage);
        }
        currentPage = string;
        System.out.println("방문: " + string);
    }

    public String goBack() {
        if (!browserHistory.isEmpty()) {
            currentPage = browserHistory.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
