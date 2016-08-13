package clement.stringfinder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.LoadStoreParameter;

public class iOSstringHandler {
	
	private static void loadStringFile(String path) throws IOException 
	{
		FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String temp;
        byte[] byteTemp;
        String sign = "\"";
        while (br.ready()) 
        {
        	temp = br.readLine();
        	
//        	if(temp.charAt(0). != "\"")
//        	{
        		System.out.println(br.readLine());
//        	}
        }
        fr.close();
	}
	
	private static void test()
	{
		String teString = "\"pciMode\" = \"Mode :\";";
		String[] output = teString.split("=");
		System.out.println(output[0].replace("\"", ""));
		System.out.println(output[1].replace("\"", "").trim());
	}
	
	private static void testFilter()
	{
		String teString = "// Larry. 2015.11.02";
		byte[] bytetest = teString.getBytes();
		char[] chartest = teString.toCharArray();
		System.out.println(chartest);
		for (char c : chartest) 
		{
			System.out.println(c);
		}
		
	}
	public static void main(String[] args) throws IOException
	{
//		loadStringFile("/Users/macmini/Desktop/test.strings");
//		test();
		testFilter();
	}
	
	

}
