package Demo;

import java.io.File;


public class Demo {

	public static void main(String[] args){
	
		File f = new File("E:\\JavaFile\\jav\\j.txt");
		boolean newFile = f.mkdir();
		System.out.println(newFile);
		
		//boolean sub = f.mkdirs();
		//System.out.println(sub);
		
		//boolean ne = f.createNewFile();
		//System.out.println(ne);
		
		//boolean cr = f.canRead();
		//System.out.println(cr);
		
		//boolean h = f.isHidden();
		//System.out.println(h);
		
		
		//String[] l = f.list();
		//for(String x : l) {
		//	System.out.println(x);
		//}
		
		//File[] fi = f.listFiles();
		//for(File c : fi) {
			//System.out.println(c);
		//}
		
	}

}
