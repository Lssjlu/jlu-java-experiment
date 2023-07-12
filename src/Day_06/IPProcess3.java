package Day_06;

import java.io.*;
import java.util.BitSet;

public class IPProcess3 implements IPProcess {

    @Override
    public void process(File in, File out) throws IOException {
        RandomAccessFile readIn = new RandomAccessFile(in, "r");
        RandomAccessFile outPut = new RandomAccessFile(out, "rw");

        String line;
        boolean flag;//记录是否重复
        readIn.seek(0);
        while ((line = readIn.readLine())!=null){
            flag = false;
            outPut.seek(0);
            String str;
            while ((str = outPut.readLine())!=null){
                if(line.equals(str)){
                    flag =true;
                    break;
                }
            }
            if(!flag){
                outPut.seek(outPut.length());
                outPut.writeBytes(line + "\n");
            }
        }
        outPut.close();
        readIn.close();
    }
}