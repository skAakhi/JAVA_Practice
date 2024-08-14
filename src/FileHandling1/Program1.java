package FileHandling1;

import java.io.File;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException  {
		
		
		/*seperators:
		 * \\ or / to create any file or directory 
		 */
		
		
		//File f = new File("E:/resume.txt");//Here you can make entire path paste or write it manually to create
		//This path created on c: drive
		
		File f = new File("D:/Aakhib_Lecture_workspace/Test/FileHandlingTest.txt/folder1.txt/folder2.txt");
		//System.out.println(f.mkdirs());
		//System.out.println(f.createNewFile());
		//System.out.println(f.delete());
		//System.out.println(f.exists());
		//f.delete();
		//if(!f.exists())
		    // f.delete();
		//System.out.println(f.createNewFile());
		//System.out.println(f.canRead());
		System.out.println(f.setReadable(true));
		//System.out.println(f.canWrite());
		System.out.println(f.setWritable(true));
		//System.out.println(f.getAbsolutePath());//[Will get entire path]
		//System.out.println(f.getName());[Name of last path folder]
		//System.out.println(f.getParent());//[will provide path upto of its parent folder or directory]
		
		
	}
	/*Paths:
	 * 1.Absolute path[Providing total path by paste_ing it ]
	 * 2.Relative path(.)[Refers current directory]
	 */
	/*
	 * Making directories(folders):
	 *  1.MKDIR()[If you want to create only single folder but can't create folder inside of that folder at same time(multiple) ]
	 *  2.MKDIRS()[If you want to create multiple folders on your own , can create folder inside of folder at same specified time]
	 *  Example:
	 *  
	 *  1.
	 *  Execution case:
	 *  File f = new File("D:/Aakhib_Lecture_workspace/Test/FileHandlingTest.txt");[FileHandling folder only created]
		System.out.println(f.mkdir());
	 *  
	 *  Error case:
	 *  File f = new File("D:/Aakhib_Lecture_workspace/Test/FileHandlingTest.txt/folder1.txt/folder2.txt");[Trying to create folder1 and folder2 at once]
		System.out.println(f.mkdir());
		
		
		2.
		Execution case:
		File f = new File("D:/Aakhib_Lecture_workspace/Test/FileHandlingTest.txt/folder1.txt/folder2.txt");[Here folder1 & folder2 are created at same time]
		System.out.println(f.mkdirs());
		
	 */
	
 
}
