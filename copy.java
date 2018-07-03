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
        Path path = Paths.get("/home/animesh/makdr"));
        String p="/home/animesh/makdr";
        String absp=p+File.separator+filename;
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file = new File(absp);

		try {
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    
}
