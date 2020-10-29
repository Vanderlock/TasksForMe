//Exercise 1: (3) Modify DirList.java (or one of its variants) so that the FilenameFilter
//opens and reads each file (using the net.mindview.util.TextFile utility) and accepts the
//file based on whether any of the trailing arguments on the command line exist in that file.


import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class Runner {
    public static void main(final String[] args) {
        File path = new File(".");
        final String[] list;
        if(args.length < 2) {
            list = path.list();
            System.out.println("Usage: enter filtering regex");
            System.out.println("followed by words, one or more of which each file must contain.");
        }
        else {
            list = path.list(new FilenameFilter() {
                private final Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches() &&
                            !(Collections.disjoint(
                                    Arrays.asList(args).subList(1, args.length),
                                    new TextFile(name, "\\W+")
                            ));
                }
            });
        }
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
    }

}
