import java.io.*;
 class FileDemo3 {
   
   public static void main(String[] args) {
      File f = null;
            try {
         
              f = new File("C:\\javaprogram\\filehandling\\classes\\file.txt");
              FileReader fin = new FileReader(f);
	      BufferedReader bin= new BufferedReader(fin);
 	      String sr;
	      System.out.println("The contents of the file are: ");	
		 while((sr=bin.readLine())!=null){
                         System.out.println(sr);
			} 
		}
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
     }
 } }
