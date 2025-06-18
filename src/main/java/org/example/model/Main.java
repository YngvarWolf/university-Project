package org.example.model;

public class Main {
    public static void main(String[] args) {
        University university = new University()
                .setId("UNI001")
                .setFullName("Московский государственный университет")
                .setShortName("МГУ")
                .setYearOfFoundation(1755)
                .setMainProfile(StudyProfile.COMPUTER_SCIENCE);

        Student student = new Student()
                .setFullName("Иван Иванов")
                .setUniversityId("UNI001")
                .setCurrentCourseNumber(3)
                .setAvgExamScore(4.5f);

        System.out.println(university);
        System.out.println(student);
    }
}
