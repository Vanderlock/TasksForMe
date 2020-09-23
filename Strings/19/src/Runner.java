//Exercise 19: (8) Building on the previous two exercises, write a program that examines
//Java source code and produces all the class names used in a particular program.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        String source = FileReaderService.getFileSource("src/Main.java");
        String sourceStrings = FileReaderService.getValues("\".*?\"", source);
        System.out.println("Strings:");
        System.out.println(sourceStrings);
        String sourceComments = FileReaderService
                .getValues("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", source);
        System.out.println("Comments:");
        System.out.println(sourceComments);
//        clearSource = FileReaderService.getValues("class[\\s|\\n]([\\w|\\d]+)",source);
//        System.out.println(clearSource);

        String clearSource = FileReaderService.getClearSource(FileReaderService.STRINGS_REGEX, source);
        clearSource = FileReaderService.getClearSource(FileReaderService.COMMENTS_REGEX, clearSource);

        List<String> identificationClassNamesList = new ArrayList<>(
                FileReaderService.getClassNamesList(FileReaderService.IDENTIFICATION_CLASS_NAME_REGEX, clearSource));
        System.out.println(identificationClassNamesList);
        List<String> importClassNamesList = new ArrayList<>(FileReaderService
                .getClassNamesList(FileReaderService.IMPORT_CLASS_NAME_REGEX, clearSource));
        System.out.println(importClassNamesList);
        List<String> newObjectClassNamesList = new ArrayList<>(FileReaderService
                .getClassNamesList(FileReaderService.NEW_OBJECT_CLASS_NAME_REGEX, clearSource));
        System.out.println(newObjectClassNamesList);
        List<String> staticClassClassNamesList = new ArrayList<>(FileReaderService
                .getClassNamesList(FileReaderService.STATIC_CALL_CLASS_NAME_REGEX, clearSource));
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
