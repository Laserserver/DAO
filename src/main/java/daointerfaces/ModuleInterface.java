package daointerfaces;

public interface ModuleInterface {

    boolean CreateStudent(String name, int groupnum, int coursenum);
    boolean DeleteStudent(String name, int groupnum, int coursenum);

    boolean CreateGroup(int groupnum, int coursenum);
    boolean DeleteGroup(int groupnum, int coursenum);

    boolean CreateCourse(int coursenum);
    boolean DeleteCourse(int coursenum);

    void SeeCourses();
    void SeeCourseGroups(int coursenum);
    void SeeGroupStudents(int groupnum, int coursenum);

    boolean StartSession();
    boolean StopSession();
}
