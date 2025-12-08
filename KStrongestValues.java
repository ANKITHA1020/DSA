import java.util.*;

class BrowserHistory {
    private final List<String> history;
    private int curr;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        curr = 0;
    }
    
    public void visit(String url) {
        // drop any forward history
        while (history.size() > curr + 1) {
            history.remove(history.size() - 1);
        }
        history.add(url);
        curr++;
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(history.size() - 1, curr + steps);
        return history.get(curr);
    }
}

/**
 * Example usage:
 * BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
 * browserHistory.visit("google.com");
 * browserHistory.visit("facebook.com");
 * browserHistory.visit("youtube.com");
 * System.out.println(browserHistory.back(1));    // "facebook.com"
 * System.out.println(browserHistory.back(1));    // "google.com"
 * System.out.println(browserHistory.forward(1)); // "facebook.com"
 * browserHistory.visit("linkedin.com");
 * System.out.println(browserHistory.forward(2)); // "linkedin.com"
 * System.out.println(browserHistory.back(2));    // "google.com"
 * System.out.println(browserHistory.back(7));    // "leetcode.com"
 */
