package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
	public static void main(String[] args) {
		//---- 2번째 시도 ----
		try {
			File myObj = new File("D:\\Screw_data\\6.35_layble\\1_BRZ-20210917105629.csv");
			Scanner myReader = new Scanner(myObj);
			String data = myReader.next();
			myReader.close();
			
			for(int i = 0; i < myObj.length(); i++) {
				System.out.println(data);
				if(i / 10 == 8) {
					System.out.println();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		//---- 2번째 시도 끝 ----
		
		//---- 1번째 시도 ----
//		try {
//			File myObj = new File("D:\\Screw_data\\6.35_layble\\1_BRZ-20210917105629.csv");
//			Scanner myReader = new Scanner(myObj);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println("/" + data);
//				System.out.println(data.split(data, 160));
//				
//			}
//			myReader.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occured.");
//			e.printStackTrace();
//		}
		
		//---- 1번째 시도 끝 ----
	}
}

