//Exercise 19: (8) Building on the previous two exercises, write a program that examines
//Java source code and produces all the class names used in a particular program.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        final String COMMENTS_REGEX = "(?:\\/\\*(?:[^*]|(?:\\*+[^*\\/]))*\\*+\\/)|(?:\\/\\/.*)";

        final String STRINGS_REGEX = "\".*?\"";
        final String IMPORT_CLASS_NAME_REGEX = "import\\s.*\\.([A-Z][a-zA-Z]+)";
        final String IDENTIFICATION_CLASS_NAME_REGEX = "\\s*class ([A-Z]\\w+)";
        final String NEW_OBJECT_CLASS_NAME_REGEX = "new\\s+([A-Z]\\w+)";
        final String STATIC_CALL_CLASS_NAME_REGEX = "\\s+([A-Z]\\w+)\\.";

        final String source = FileReaderService.getFileSource("src/Runner.java");
        String sourceStrings = FileReaderService.getValues(STRINGS_REGEX, source);

        System.out.println("Strings:");
        System.out.println(sourceStrings);
        String sourceComments = FileReaderService.getValues(COMMENTS_REGEX, source);

        System.out.println("Comments:");
        System.out.println(sourceComments);
        //comments for test
//        clearSource = FileReaderService.getValues("class[\\s|\\n]([\\w|\\d]+)",source);
//        System.out.println(clearSource);
        //comments for test

        String clearSource = FileReaderService.getClearSource(STRINGS_REGEX, source);
        clearSource = FileReaderService.getClearSource(COMMENTS_REGEX, clearSource);

        List<String> identificationClassNamesList = new ArrayList<>(FileReaderService.getClassNamesList(IDENTIFICATION_CLASS_NAME_REGEX, clearSource));
        System.out.println(identificationClassNamesList);
        List<String> importClassNamesList = new ArrayList<>(FileReaderService.getClassNamesList(IMPORT_CLASS_NAME_REGEX, clearSource));
        System.out.println(importClassNamesList);
        List<String> newObjectClassNamesList = new ArrayList<>(FileReaderService.getClassNamesList(NEW_OBJECT_CLASS_NAME_REGEX, clearSource));
        System.out.println(newObjectClassNamesList);
        List<String> staticClassClassNamesList = new ArrayList<>(FileReaderService.getClassNamesList(STATIC_CALL_CLASS_NAME_REGEX, clearSource));
        System.out.println(staticClassClassNamesList);

        Set<String> set = new LinkedHashSet<>(identificationClassNamesList);
        set.addAll(importClassNamesList);
        set.addAll(newObjectClassNamesList);
        set.addAll(staticClassClassNamesList);
        List<String> allClassNames = new ArrayList<>(set);

        System.out.println("All classfile class names:");
        System.out.println(allClassNames);
    }
}
