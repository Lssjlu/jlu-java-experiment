package Day_07;

/*给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
'?' 可以匹配任何单个字符。
'*' 可以匹配任意字符串（包括空字符串）。
两个字符串完全匹配才算匹配成功。

说明:
    s 可能为空，且只包含从 a-z 的小写字母。
p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。

方法接口如下：
public static boolean isMatch(String s, String p) {
}*/
public class demo_01 implements isMatch {
    @Override
    public boolean Match(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        //空字符串和空模式
        dp[0][0] = true;
        //空字符串和非空模式
        for (int i = 1; i < p.length() + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < p.length() + 1; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[s.length()][p.length()];


    }

    public static void main(String[] args) {
        demo_01 demo01 = new demo_01();
        System.out.println(demo01.Match("fjkjkqsqsnck", "fjkjkqs*"));
    }
}
