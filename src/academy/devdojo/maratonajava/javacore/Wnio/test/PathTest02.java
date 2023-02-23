package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");//new file (pasta)
        if(Files.notExists(pastaPath)) {
            Path pastaDirecotry = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt"); // filePath o arquivo original

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(pastaPath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "File_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
