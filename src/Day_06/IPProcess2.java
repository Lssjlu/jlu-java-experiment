package Day_06;

import java.io.*;
import java.util.BitSet;

import static java.util.BitSet.valueOf;

public class IPProcess2 implements IPProcess {

    private BitSet ipset = new BitSet();

    @Override
    public void process(File in, File out) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(out));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split("\\.");
            long ip = 0;
            for (int i = 0; i < 4; i++) {
                ip = (ip << 8) | Long.parseUnsignedLong(strings[i]);
            }
            //BitSet能处理的最大位数是int的最大整数，使用BitSet.valueOf()，直接将一个long类型的值转换为一个BitSet对象
            BitSet ipbitset = BitSet.valueOf(new long[]{ip});
            if (!ipset.intersects(ipbitset)) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                ipset.or(ipbitset);
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
