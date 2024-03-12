package generic.wildcard.school;

import generic.wildcard.school.*;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();

        Worker worker = new Worker();
        Person person = new Person();
        Student student = new Student();
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        MiddleSchoolStudent middleSchoolStudent = new MiddleSchoolStudent();

        // 지원서
        Applicant<Person> personApplicant = new Applicant<>(person);
        Applicant<Worker> workerApplicant = new Applicant<>(worker);
        Applicant<Student> studentApplicant = new Applicant<>(student);
        Applicant<HighSchoolStudent> highSchoolStudentApplicant = new Applicant<>(highSchoolStudent);
        Applicant<MiddleSchoolStudent> middleSchoolStudentApplicant = new Applicant<>(middleSchoolStudent);

        // 모두의 과정 : Applicant<?>
        course.registerCourse(personApplicant);
        course.registerCourse(workerApplicant);
        course.registerCourse(studentApplicant);
        course.registerCourse(highSchoolStudentApplicant);
        course.registerCourse(middleSchoolStudentApplicant);

        // 학생만 신청 과정 : Applicant<? extends Student>
        // course.registerCourse2(personApplicant);
        // course.registerCourse2(workerApplicant);
        course.registerCourse2(studentApplicant);
        course.registerCourse2(highSchoolStudentApplicant);
        course.registerCourse2(middleSchoolStudentApplicant);

        // 일반인, 직장인 신청 과정 : Applicant<? super Worker>
        course.registerCourse3(personApplicant);
        course.registerCourse3(workerApplicant);
        // course.registerCourse3(studentApplicant);
        // course.registerCourse3(highSchoolStudentApplicant);
        // course.registerCourse3(middleSchoolStudentApplicant);
    }
}

