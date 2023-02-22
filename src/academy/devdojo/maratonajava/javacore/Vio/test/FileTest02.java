package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirestorio = new File("pasta");
        boolean isDiretorioCreated = fileDirestorio.mkdir();
        System.out.println("Pasta criada?" +isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDirestorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? "+isFileCreated);

        File fileRenamed = new File(fileDirestorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado "+isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDirestorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? "+isDiretorioRenomeado);

    }
}
