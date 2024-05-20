package sec9.test.stack.ex2;

import java.util.Stack;

public class BrowserHistory2 {

    private String currentPage = null;
    private Stack<String> history = new Stack<>();

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문 : " + currentPage);
    }

    public void printAll(){
        System.out.println("=== 방문한 모든 페이지 ===");
        for (String s : history){
            System.out.println(s);
        }
        System.out.println("==========");
    }

    public String goBack(){
        if (!currentPage.isEmpty()){
            String backPage = history.pop();
            System.out.println("뒤로 가기 : " + backPage);
            return backPage;
        }
        return null;
    }
}
