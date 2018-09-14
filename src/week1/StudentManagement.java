package week1;


public class StudentManagement {
    public static int n = 6;
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static Student students[] = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup() == null || s2.getGroup() == null) {
            return false;
        } else {
            return (s1.getGroup().equals(s2.getGroup()));
        }
        // xóa dòng này sau khi cài đặt
    }

    static void studentsByGroup() {
        // TODO:
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            check[i] = true;
        }
        for (int i = 0; i < n; i++) {
            if (check[i]) {
                System.out.println("Lop: " + students[i].getGroup());
                System.out.println(students[i].getName());
                for (int j = i + 1; j < n; j++) {
                    if (sameGroup(students[i], students[j])) {
                        System.out.println(students[j].getName());
                        check[j] = false;
                    }
                }
            }
        }
    }

    static void removeStudent(String id) {
        // TODO:
        if (id == null)
            System.out.println("ID khong hop le");
        else {
            for (int i = 0; i < n; i++) {
                if (students[i].getId() == id) {
                    for (int j = i; j < n - 1; j++)
                        students[j] = students[j + 1];
                    n--;
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        students[0] = new Student();
        students[0].setName("Nguyen Xuan Hoang");
        students[0].setId("17020772");
        students[0].setEmail("xuanhoang30071999@gmail.com");
        students[0].setGroup("K62-CF");

        System.out.println(students[0].getName());
        students[0].getInfo();

        System.out.println("____________________________________");
        System.out.println();

        students[1] = new Student();
        students[1].getInfo();

        System.out.println("____________________________________");
        System.out.println();

        students[2] = new Student("Nguyen Lang Duong", "14081999", "langduong99nd@gmail.com");
        students[2].getInfo();

        System.out.println("____________________________________");
        System.out.println();

        students[3] = new Student();
        students[3].setGroup("INT22041");

        students[4] = new Student();
        students[4].setGroup("INT22042");

        students[5] = new Student(students[0]);
        students[5].getInfo();

        System.out.println("____________________________________");
        System.out.println();

        studentsByGroup();
        if (sameGroup(students[3], students[4]))
            System.out.println("Cùng lớp");
        else
            System.out.println("Khác lớp");

        System.out.println();
        removeStudent("000");
        System.out.println("______________________________________");
    }
}