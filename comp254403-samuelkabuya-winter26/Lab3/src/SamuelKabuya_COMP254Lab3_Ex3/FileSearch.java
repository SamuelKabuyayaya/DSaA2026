package SamuelKabuya_COMP254Lab3_Ex3;

import java.io.File;

public class FileSearch {

    public static void find(File path, String filename) {
        if (path.isDirectory()) {
            File[] contents = path.listFiles();

            if (contents != null)
                for (File child : contents) {
                    find(child, filename);
                }
        } else {
            if (path.getName().equals(filename)) {
                System.out.println("File: " + path.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        File rootDir = new File("C:\\Users\\samso\\Downloads\\DSaA2026");
        String targetFile = "RecursiveProduct.java";
        System.out.println("Searching for: " + targetFile);

        find(rootDir, targetFile);
    }
}
