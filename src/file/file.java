package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class file {
	
	
public void Create(){
	

	File newfile = new File("c:\\tmp\\studentprogram.txt");
}	

public void DataSave(){
	try {
		FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);//저장소에 쓰기;
	PrintWriter pw = new PrintWriter(file);
	
	
	pw.print("안녕");
	pw.println("하이");
	pw.println("건강해");
	pw.close();
	//bw.close();
	//fw.close();
	}catch(IOException e){
		
	}
	
}



}
