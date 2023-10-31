package classexercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) throws IOException {
//		File fileobj = new File("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\newfile.txt");
//		try {
//			if (fileobj.createNewFile()) {
//				System.out.println("New File Created!");
//			} else {
//				System.out.println("Already Exists");
//			}
//		} catch (FileNotFoundException ex) {
//			ex.printStackTrace();
//		}

		/* Method 1 - writing into a file */
//        FileWriter fileWriter = new FileWriter("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\test1.txt");
//	      fileWriter.write("Java has a content now!!" + "\n");
//		  fileWriter.append("Appending as a second line!" + "\n");
//		  fileWriter.write("Java has a content now as a 3rd line!!");
//		  fileWriter.close();
		
		

		
		
		
		/* all together */
//		File fileobj = new File("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\newfile.txt");
//		try {
//			if (fileobj.createNewFile()) {
//				System.out.println("New File Created!");
//			} else {
//				System.out.println("Already Exists");
//			}
//		} catch (FileNotFoundException ex) {
//			ex.printStackTrace();
//		}
//
//		FileWriter fileWriter = new FileWriter("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\test1.txt");
//		fileWriter.append("Java programming is easy!");
//		fileWriter.close();
		
		
		
		/*
		 * buffering using offset
		 */
//		Scanner sc1 = new Scanner(System.in);
//		FileWriter file1 = new FileWriter("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\newfile1.txt");
//		String data1 = "";
//		BufferedWriter bf1 = null;
//		try {
//			System.out.println("Enter the content");
//			data1 = sc1.nextLine();
//			System.out.println("Enter the offset");
//			int offset = sc1.nextInt();
//			bf1 = new BufferedWriter(file1);
//			bf1.write(data1,offset,data1.length()-offset);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		bf1.close();
//		sc1.close();
		
		
		/*
		 * Method - 2 writing file using bufferWriter write until  user wants
		 */
//		Scanner sc = new Scanner(System.in);
//		FileWriter file = new FileWriter("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\newfile1.txt");
//		String data = "";
//		BufferedWriter bf = null;
//		try {
//			System.out.println("Enter the content");
//			bf = new BufferedWriter(file);
//			while (!data.contentEquals("/")) {
//				data = sc.nextLine();
//				bf.write(data,0,data.length());
//				bf.newLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		bf.close();
//		sc.close();
		
		
		/*
		 * Read content of file
		 */
		char[] array = new char[100];
		try {
			FileReader readFile = new FileReader("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\newfile1.txt");
			readFile.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			readFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		/*
		 * delete the file
		 */
		
//		File filedelete = new File("C:\\Users\\rojin\\Desktop\\Epita\\Java\\l3\\newfile1.txt");
//		boolean value = filedelete.delete();
//		if (value) {
//			System.out.println("The File is deleted.");
//		} else {
//			System.out.println("The File is not deleted.");
//		}
		
		
		// check if it an read/write/get path

				/*
				 * System.out.println(fileObj1.canRead());
				 * System.out.println(fileObj1.canWrite());
				 * System.out.println(fileObj1.getAbsolutePath());
				 * System.out.println(fileObj1.length());
				 */
		
		
		
		
		
		
		
		
		
		
	}

}
