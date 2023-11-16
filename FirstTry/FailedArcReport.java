package FirstTry;

/*
import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
public class FailedArcReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<String> filelist = new ArrayList<>();
//	        String path1 = "D:\\Sogeti\\FAILARC\\failedarc.txt";
	        String path1 = "C:\\TestDSG\\failedarc.txt";
	        
	        List<String> list1 = checkReport(); // Get the names of the servers.
	        //System.out.println("------------");
	        failedArcFolder(list1);
	        //addingDataToFile(path1, filelist);
	    }

	    public static void failedArcFolder(List<String> list1) {
		// TODO Auto-generated method stub
	    	ArrayList<String> al=new ArrayList<>();
	    	for(String i:list1) {
//	    		 String sourceFolderPath = "\\\\"+i+"\\e$\\DownloadFiles\\FailedArchive";
//	    	       String destinationFolderPath = "\\\\"+i+"\\e$\\DownloadFiles";
	    	       
	    	       
	    	       String sourceFolderPath = "C:\\TestDSG\\Download\\FiledArcFolder";
	    	       String destinationFolderPath = "C:\\TestDSG\\Download";


	    	        try {
	    	           al.addAll( moveFiles(sourceFolderPath, destinationFolderPath));
	    	        //   System.out.println("------------");
	    	        } catch (IOException e) {
	    	            e.printStackTrace();
	    	        }
	    	        String path2 = "C:\\\\TestDSG\\\\failedarc_res.txt";
	    	        try {
//	    	        FileOutputStream fos=new FileOutputStream(path2);
//	    	        DataOutputStream dos=new DataOutputStream(fos);
	    	       // FileWriter fw=new FileWriter(path2);
	    	        	FileOutputStream fw=new FileOutputStream(path2);
	    	        for(int j=0;j<al.size();j++) {
	    	        	fw.write(al.get(j).getBytes());
	    	        	fw.write("\n".getBytes());
	    	        }
	    	        }
	    	        catch(Exception e) {
	    	        	e.printStackTrace();
	    	        }
	    	    }
	    }

	    	    public static ArrayList<String> moveFiles(String sourceFolder, String destinationFolder) throws IOException {
	    	        Path sourcePath = Paths.get(sourceFolder);
	    	        Random r=new Random();
//	    	        System.out.println("---------");
	    	        Path destinationPath = Paths.get(destinationFolder);
	    	        ArrayList<String> al=new ArrayList<>();
	    	        if (!Files.exists(sourcePath) || !Files.isDirectory(sourcePath)) {
	    	           // System.err.println("Source folder does not exist or is not a directory.");
	    	            
	    	            		al.add("Source folder does not exist or is not a directory.") ;
	    	            		return al;
	    	        }
//	    	        System.out.println("---------");
	    	        if (!Files.exists(destinationPath)) {
	    	            Files.createDirectories(destinationPath);
	    	        }
//	    	        System.out.println("---------");
	    	        if (!Files.isDirectory(destinationPath)) {
	    	           // System.err.println("Destination is not a directory.");
	    	           al.add ("Destination is not a directory.");
	    	            return al;
	    	        }
//	    	        System.out.println("---------");
	    	        
	    	        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourcePath)) {
	    	            for (Path sourceFilePath : directoryStream) {
//	    	            	System.out.println("---------");
	    	            	String orginalFileName=sourceFilePath.getFileName().toString();
	    	            	int index=orginalFileName.indexOf(".");
	    	            	String firstHalf=orginalFileName.substring(0,index);
	    	            	String secondHalf=orginalFileName.substring(index+1);
	    	            	int randomNumber=r.nextInt(0,9);
	    	            	String newFileName="";
	    	            	for(int i=0;i<firstHalf.length();i++) 
	    	            		{
	    	            			char c=firstHalf.charAt(i);
	    	            			newFileName=newFileName+c;
	    	            			
	    	            		}
	    	            	//System.out.println("--------");
	    	            	newFileName=newFileName+randomNumber;
	    	            	newFileName=newFileName+"."+secondHalf;
	    	            	
	    	                Path destinationFilePath = destinationPath.resolve(newFileName);
	    	                Files.move(sourceFilePath, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
	    	                al.add("Moved: " + sourceFilePath.getFileName());
	    	            }
	    	        }

	    	        al.add("All files moved successfully.");
	    	        return al;
	    	    }
	    	

		public static List<String> checkReport() {
	        List<String> storeList = new ArrayList<>();
	        
	        String server = "";
	        String storeNum = "";
	        

	        try {
	            BufferedReader arcFile = new BufferedReader(new FileReader("C:\\TestDSG\\failedarc.txt"));
	            String line;

	            while ((line = arcFile.readLine()) != null) {
	                if ( line.contains("--")) {
	                	
	                    String[] parts = line.split(" ");
	                    
	                    storeNum = parts[1];
	                    storeNum = "0".repeat(5 - storeNum.length()) + storeNum;
	                    
	                    if (parts[6].equalsIgnoreCase("Primary:")) {
	                        server = "D100";
	                        
	                    } else if (parts[6].equalsIgnoreCase("Secondary:")) {
	                        server = "D101";
	                    } else {
	                        System.out.println("Error");
	                    }
	                    
	                    storeList.add(storeNum + server);
	                    System.out.println(storeNum + server);
	                    
	                }
	                
	                
	            }

	            arcFile.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return storeList;
	    }

	}

*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FailedArcReport {

    public static void main(String[] args) {
        String path1 = "C:\\TestDSG\\failedarc.txt";
//        String path1 = "D:\\Sogeti\\FAILARC\\failedarc.txt";
        List<String> list1 = checkReport();
        failedArcFolder(list1);
    }

    public static void failedArcFolder(List<String> list1) {
        ArrayList<String> al = new ArrayList<>();
        for (String i : list1) {
//        	String sourceFolderPath = "\\\\"+i+"\\e$\\DownloadFiles\\FailedArchive";
// 	       String destinationFolderPath = "\\\\"+i+"\\e$\\DownloadFiles";
            String sourceFolderPath = "C:\\TestDSG\\Download\\FiledArcFolder";
            String destinationFolderPath = "C:\\TestDSG\\Download";

            try {
            	al.add(i);
                al.addAll(moveFiles(sourceFolderPath, destinationFolderPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String path2 = "C:\\TestDSG\\failedarc_res.txt";
//            String path2="D:\\Sogeti\\FAILARC\\failed_arc_res.txt"
            try {
                FileOutputStream fw = new FileOutputStream(path2);
                for (int j = 0; j < al.size(); j++) {
                    fw.write(al.get(j).getBytes());
                    fw.write("\n".getBytes());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<String> moveFiles(String sourceFolder, String destinationFolder) throws IOException {
        File sourceDir = new File(sourceFolder);
        Random r = new Random();
        ArrayList<String> al = new ArrayList<>();

        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            al.add("Source folder does not exist or is not a directory.");
            return al;
        }

        File destinationDir = new File(destinationFolder);

        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }

        if (!destinationDir.isDirectory()) {
            al.add("Destination is not a directory.");
            return al;
        }

        File[] files = sourceDir.listFiles();

        if (files != null) {
            for (File sourceFile : files) {
                String originalFileName = sourceFile.getName();
                int dotIndex = originalFileName.lastIndexOf(".");
                String firstHalf = originalFileName.substring(0, dotIndex-1);
                String secondHalf = originalFileName.substring(dotIndex + 1);
                int randomNumber = r.nextInt(0,9);
                String newFileName = firstHalf + randomNumber + "." + secondHalf;

                File destinationFile = new File(destinationDir, newFileName);
                if (sourceFile.renameTo(destinationFile)) {
                    al.add("Moved and renamed: " + newFileName);
                } else {
                    al.add("Failed to move or rename: " + sourceFile.getName());
                }
            }
        }

        al.add("All files moved and renamed successfully.");
        return al;
    }

    public static List<String> checkReport() {
        List<String> storeList = new ArrayList<>();
        String server = "";
        String storeNum = "";

        try {
            BufferedReader arcFile = new BufferedReader(new FileReader("C:\\TestDSG\\failedarc.txt"));//D:\\Sogeti\\FAILARC\\failedarc.txt
            String line;

            while ((line = arcFile.readLine()) != null) {
                if (line.contains("--")) {
                    String[] parts = line.split(" ");
                    storeNum = parts[1];
                    storeNum = "0".repeat(5 - storeNum.length()) + storeNum;

                    if (parts[6].equalsIgnoreCase("Primary:")) {
                        server = "D100";
                    } else if (parts[6].equalsIgnoreCase("Secondary:")) {
                        server = "D101";
                    } else {
                        System.out.println("Error");
                    }

                    storeList.add(storeNum + server);
                    System.out.println(storeNum + server);
                }
            }

            arcFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return storeList;
    }
}

