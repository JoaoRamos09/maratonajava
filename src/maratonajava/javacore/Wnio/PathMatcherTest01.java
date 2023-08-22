package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.txt");
        Path path2 = Paths.get("pasta/subpasta/arquivo.txt");
        Path path3 = Paths.get("pasta/subpasta/arquivo.java");
        Path path4 = Paths.get("amendoin.txt");
        Path path5 = Paths.get(".");


        matches(path2,"glob:**.txt");
        matches(path3,"glob:**.????");
        matches(path3,"glob:**.{txt,java}");
    }

    public static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob +": "+pathMatcher.matches(path));
    }
}
