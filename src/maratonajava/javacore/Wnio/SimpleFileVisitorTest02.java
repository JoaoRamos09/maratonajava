package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLOutput;

class VisitFiles1 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre dir "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file.getFileName());
        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("pos dir "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

    public class SimpleFileVisitorTest02 {
        public static void main(String[] args) throws IOException {
            Path dir = Paths.get("pasta");
            Files.walkFileTree(dir, new VisitFiles1());
        }
    }
