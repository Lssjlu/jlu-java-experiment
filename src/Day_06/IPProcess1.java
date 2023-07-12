package Day_06;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*有一包含100亿条IP访问信息的文本文件，每一行是一个IPv4地址（如：192.168.1.1），要求对文件进行一遍扫描后输出所有出现过的IP地址（不能重复）。
按下面三个不同的要求分别给出三个不同的实现类IPProcess1，IPProcess2，IPProcess3。
需要实现的接口如下： interface IPProcess{ void process(File in, File out) throws IOException; }
可以添加辅助类，请添加详细的设计说明和注释来解释程序。
IPProcess1: 内存足够大，直接使用HashMap进行数据处理
IPProcess2: 假设可用内存为1G，在内存中实现处理过程。（提示：创建 byte数组，每一位表示一个IP地址，IPV4每位取值范围0-255，可采用位操作）
IPProcess3: 假设内存非常少，必须在文件进行操作。
（提示：使用RandomAccessFile, 可以使用read()， write()，read(byte[] b) ，write(byte[] b)，seek(long pos)，getFilePointer()方法 ）*/
public class IPProcess1 implements IPProcess{

    @Override
    public void process(File in, File out) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
        Map<String,Integer> map = new HashMap<>();
        String str;
        while ((str = bufferedReader.readLine()) != null){
            map.put(str, 0);
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(out));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            bufferedWriter.write(key);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
