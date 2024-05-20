package sec9.test.stack.ex2;

import java.util.Stack;

public class BrowserHistory {

    private String currentPage = null;

    Stack<String> pageStack = new Stack<>();

    public void visitPage(String url){
        if (currentPage != null){
            pageStack.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문 : " + url);
    }

    public String goBack(){
        if (!pageStack.isEmpty()){
            currentPage = pageStack.pop();
            System.out.println("뒤로가기 = " + currentPage);
            return currentPage;
        }
        return null;
    }
}
