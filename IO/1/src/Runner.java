//Exercise 1: (3) Modify DirList.java (or one of its variants) so that the FilenameFilter
//opens and reads each file (using the net.mindview.util.TextFile utility) and accepts the
//file based on whether any of the trailing arguments on the command line exist in that file.





import java.io.*;
import java.util.*;

public class Runner {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        System.out.println("args: 1)extension 2)word in file");
        if(args.length == 0) {
            list = path.list();
        }
        else {
            list = path.list(new FilenameFilter() {
                private final String ext = args[0].toLowerCase();
                public boolean accept(File dir, String name) {
                    if(name.toLowerCase().endsWith(ext)) {
                        if(args.length == 1) {
                            return true;
                        }
                        Set<String> words = new HashSet<>(new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));
                        for(int i = 1; i < args.length; i++) {
                            if(words.contains(args[i])) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            });
        }
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}

