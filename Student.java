import java.util.Scanner;
import java.util.ArrayList;
class Student {
    int id;
    String name;
    String grade;
    Student(int id,String name,String grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public String toString(){
        return name+":"+id+":"+grade;
    }
}

class Main{
    static Scanner sc;
    public static void addStudent(ArrayList<Student>students){
        System.out.println("Enter the Student name, id and grade");
        String name=sc.nextLine();
        int id=sc.nextInt();
        String grade=sc.nextLine();
        students.add(new Student(id,name,grade));
    }
    public static void removeStudent(ArrayList<Student>students,int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).id==id){
                students.remove(i);
                break;
            }
        }
    }
    public static void displayStudents(ArrayList<Student>students){
        System.out.println("Students:");
        for(Student s:students){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student>students=new ArrayList<>();
        sc=new Scanner(System.in);
        l1:while(true){
            System.out.println("Enter 1 to add Student");
            System.out.println("Enter 2 to remove Student");
            System.out.println("Enter 3 to display Student");
            System.out.println("Enter 4 to exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    System.out.println("Enter the id student to be deleted");
                    int id=sc.nextInt();
                    removeStudent(students, id);
                    break;
                case 3:
                    displayStudents(students);
                    break;
                case 4:
                    break l1;
            }
        }
        sc.close();
    }
}
