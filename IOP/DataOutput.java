import java.io.*;
public class DataOutput{
public static void main(String[]arg)throws Exception{
	FileOutputStream ip1 = new FileOutputStream("File5.txt");
	DataOutputStream dp = new DataOutputStream(ip1);
	
	//ip1.write(89);
	dp.writeInt(896);
	dp.flush();
	dp.close();	
	ip1.close();
	}
	}