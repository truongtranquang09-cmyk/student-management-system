package student.management;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentManager(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentManager(){ this.studentList = new ArrayList<>();}

    public void addStudent(Student s){
        this.studentList.add(s);
    }

    public void removeStudentById(String id){
        this.studentList.removeIf(s->s.getId().equals(id));
    }

    public int getStudentCount(){
        return this.studentList.size();
    }

    public void findStudentById(String id){
        int cnt = 0;
        for (Student s : studentList){
            if(s.getId().equals(id)){
                System.out.println(s);
                cnt++;
            }
        }
        if(cnt==0) System.out.println("No student found with the id " + id);
    }

    public void findStudentByName(String name){
        int cnt = 0;
        for (Student s : studentList){
            if(s.getFullName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(s);
                cnt++;
            }
        }
        if(cnt==0) System.out.println("No student found with the name " + name);
        else if(cnt==1) System.out.printf("There is 1 student named '%s'\n", name);
        else System.out.printf("There are %d students named '%s'\n", cnt, name);
    }

    public void sortStudentByCpa(){
        this.studentList.sort((s1,s2)->Double.compare(s1.getCpa(), s2.getCpa()));
    }

    public void sortStudentByName(){
        this.studentList.sort((s1,s2)->s1.getFullName().compareTo(s2.getFullName()));
    }

    public boolean isListEmpty(){
        return this.studentList.isEmpty();
    }

    public void clearList(){
        this.studentList.clear();
    }

    public void printList(){
        for (Student s : studentList)
            System.out.println(s);
    }
}
