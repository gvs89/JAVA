package controllers;

import data.classes.EducationGroup;
import data.classes.Stream;
import data.classes.Student;
import data.classes.Teacher;

import data.interfaces.IStream;
import services.classes.EducationGroupService;
import services.classes.StreamService;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class EducationController {
    private static final StreamService streamService = new StreamService();
    private static final EducationGroupService groupService = new EducationGroupService();
   
    private static int lastGroupNumber = 0;


    public static Stream newStream(String name,  int countGroups, int minStudentCount, int maxStudentCount){
        Stream stream = new Stream(name);
        Random random = new Random();

        for (int i = 0; i < countGroups; i++) {
            stream.addGroup(newGroup(random.nextInt(minStudentCount, maxStudentCount)));
        }

        return stream;
    }


    public static void showGroupList(Stream stream){
        Logger logger = Logger.getAnonymousLogger();

        for (var g : stream) {
            logger.info(g.toString());
        }
    }

    public static void sortListStream(List<IStream> list){
        streamService.sortByGroupCount(list);
    }

    public static EducationGroup newGroup(int countStudent){
        List<Student> students = new ArrayList<>();

        for (int i=1; i<=countStudent; i++){
            students.add(new Student(String.format("%dй студент", i), "12.11.2001", i));
        }

        lastGroupNumber++;

        return new EducationGroup(lastGroupNumber,
                String.format("Группа %d", lastGroupNumber),
                new Teacher("Petrov", "17.06.1991",1, "teacher"),
                students);
    }

    public static EducationGroup readGroup(String fileName){
        return groupService.loadGroupFromTxt(fileName);
    }

    public static void saveGroup(String fileName, EducationGroup group){
        groupService.saveGroupToTxt(fileName, group);
    }

}
