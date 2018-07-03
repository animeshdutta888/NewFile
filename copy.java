package path;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
public class copy {
    public static void main(String[] args) {
		String filename = "newFile.txt";
        Path path = Paths.get(URI.create("file:///home/animesh/makdr1"));
        String p="/home/animesh/makdr";
        String absp=p+File.separator+filename;
        File file = new File(absp);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
                if (file.createNewFile()) {
    				System.out.println("File is created!");
            }} catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
    

		

    }
    
}
