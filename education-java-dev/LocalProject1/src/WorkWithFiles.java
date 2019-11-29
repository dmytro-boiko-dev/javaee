import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {

	public static void main(String[] args) {
		
		File dir = new File("C:\\JavaTestDirectory");
		
		if(dir.isDirectory()){
			
			for(File item : dir.listFiles()){
				if(item.isDirectory()){
					System.out.println(item.getName() + " directory");
				}
				else{
					System.out.println(item.getName() + " file");
				}
				
			}
		}
		
		
		 try(FileWriter writer = new FileWriter("C:\\JavaTestDirectory\\text1.txt", false))
	        {
	           // запись всей строки
	            String text = "I'm developer! \n";
	            writer.write(text);
	            // запись по символам
	            writer.append('\n');
	            writer.append('D');
	             
	            writer.flush();
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
		
		
		

	}

}
