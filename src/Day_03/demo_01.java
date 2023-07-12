package Day_03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//编写一个英文词频统计的程序。统计时不区分大小写，忽略所有的数字和标点符号。
//要求能处理普通的txt文本和html文本。在处理html文本时，要求过滤掉所有的html标签
public class demo_01 {

    static void count() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(in));

        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }

        String res = stringBuilder.toString().
                replaceAll("<.+?>|[^a-zA-Z]", " ").
                replaceAll(" {2,}", " ").
                trim().toUpperCase();
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] sArray = res.split(" ");
        for (String s : sArray) {
            Integer num = map.get(s);
            if (num == null) {
                map.put(s, 1);
            } else {
                map.replace(s, ++num);
            }
        }


        map.remove("");//去除空格
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = String.valueOf(map.get(key));
            System.out.println(key + ":" + value);
        }
    }

    public static void main(String[] args) throws IOException {
        count();
    }


}
