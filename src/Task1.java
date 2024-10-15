import java.util.Scanner;

public class Task1 {
    static class Person{
        String name;
        int age;
        String position;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
            this.position = "Person";
        }
        public Person(String name){
            this.name = name;
        }

        void setAge(int age){
            this.age = age;
        }
        int getAge(){
            return this.age;
        }
        void setName(String name){
            this.name = name;
        }
        String getName(){
            return this.name;
        }
        void Show(){
            System.out.println(this.position);
            System.out.printf("Name: %s\n",this.name);
            System.out.printf("Age: %d\n",this.age);
        }
    }

    static class Student extends Person{
        int grade;
        int scholarship;
        String major;
        public Student(String name, int age, int grade, int scholarship, String major){
            super(name,age);
            this.grade = grade;
            this.scholarship = scholarship;
            this.major = major;
            this.position = "Student";
        }
        void setGrade(int grade){
            this.grade = grade;
        }
        int getGrade(){
            return this.grade;
        }
        void setScholarship(int scholarship){
            this.scholarship = scholarship;
        }
        int getScholarship(){
            return this.scholarship;
        }
        void setMajor(String major){
            this.major = major;
        }
        String getMajor(){
            return this.major;
        }
        @Override
        void Show(){
            System.out.println(this.position);
            System.out.printf("Name: %s\n",this.name);
            System.out.printf("Age: %d\n",this.age);
            System.out.printf("Grade: %d\n",this.grade);
            System.out.printf("Scholarship: %d\n",this.scholarship);
            System.out.printf("Major: %s\n",this.major);
        }
    }
    static class Lecturer extends Person{
        int experience;
        int salary;
        String subject;
        public Lecturer(String name, int age, int experience, int salary, String subject){
            super(name,age);
            this.experience = experience;
            this.salary = salary;
            this.subject = subject;
            this.position = "Lecturer";
        }
        void setExperience(int experience){
            this.experience = experience;
        }
        int getExperience(){
            return this.experience;
        }
        void setSalary(int salary){
            this.salary = salary;
        }
        int getSalary(){
            return this.salary;
        }
        void setSubject(String subject){
            this.subject = subject;
        }
        String getSubject(){
            return this.subject;
        }
        @Override
        void Show(){
            System.out.println(this.position);
            System.out.printf("Name: %s\n",this.name);
            System.out.printf("Age: %d\n",this.age);
            System.out.printf("Experience: %d\n",this.experience);
            System.out.printf("Salary: %d\n",this.salary);
            System.out.printf("Subject: %s\n",this.subject);
        }
    }
    static class HeadOfTheDepartment extends Lecturer{
        String department;
        public HeadOfTheDepartment(String name, int age, int experience, int salary, String subject, String department){
            super(name,age,experience,salary,subject);
            this.department = department;
            this.position = "Head Of The Department";
        }
        void setDepartment(String department){
            this.department = department;
        }
        String getDepartment(){
            return this.department;
        }
        @Override
        void Show(){
            System.out.println(this.position);
            System.out.printf("Name: %s\n",this.name);
            System.out.printf("Age: %d\n",this.age);
            System.out.printf("Experience: %d\n",this.experience);
            System.out.printf("Salary: %d\n",this.salary);
            System.out.printf("Subject: %s\n",this.subject);
            System.out.printf("Department: %s\n",this.department);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] college = new Person[4];
        int choice;
        System.out.println("1.Custom\n2.Auto");
        System.out.print("Please enter your choice: ");
        choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.print("Please enter the name of the person");
                String name = sc.next();
                System.out.print("Please enter the age of the person");
                int age = sc.nextInt();
                Person person = new Person(name,age);
                college[0] = person;
                System.out.print("Please enter the name of the student");
                String name1 = sc.nextLine();
                System.out.print("Please enter the age of the student");
                int age1 = sc.nextInt();
                System.out.print("Please enter the grade of the student");
                int grade1 = sc.nextInt();
                System.out.print("Please enter the scholarship of the student");
                int scholarship1 = sc.nextInt();
                System.out.print("Please enter the major of the student");
                String major1 = sc.nextLine();
                Student student = new Student(name1,age1,grade1,scholarship1,major1);
                college[1] = student;
                System.out.print("Please enter the name of the Lecturer");
                String name2 = sc.nextLine();
                System.out.print("Please enter the age of the Lecturer");
                int age2 = sc.nextInt();
                System.out.print("Please enter the experience of the Lecturer");
                int experience2 = sc.nextInt();
                System.out.print("Please enter the salary of the Lecturer");
                int salary2 = sc.nextInt();
                System.out.print("Please enter the subject of the Lecturer");
                String subject2 = sc.nextLine();
                Lecturer lecturer = new Lecturer(name2,age2,experience2,salary2,subject2);
                college[2] = lecturer;
                System.out.print("Please enter the name of the Head Of The Department");
                String name3 = sc.nextLine();
                System.out.print("Please enter the age of the Head Of The Department");
                int age3 = sc.nextInt();
                System.out.print("Please enter the experience of the Head Of The Department");
                int experience3 = sc.nextInt();
                System.out.print("Please enter the salary of the Head Of The Department");
                int salary3 = sc.nextInt();
                System.out.print("Please enter the subject of the Head Of The Department");
                String subject3 = sc.nextLine();
                System.out.print("Please enter the department of the Head Of The Student");
                String department = sc.nextLine();
                HeadOfTheDepartment headOfTheDepartment = new HeadOfTheDepartment(name3,age3,experience3,salary3,subject3,department);
                college[3] = headOfTheDepartment;
                break;
            }
            case 2:{

                Person Vladimir = new Person("Vladimir", 18);
                college[0] = Vladimir;
                Student Ivan = new Student("Ivan",18,2,0,"Computer Science");
                college[1] = Ivan;
                Lecturer Somebody = new Lecturer("Pavlo",27,4,14_000,"Math");
                college[2] = Somebody;
                HeadOfTheDepartment Somebody1 = new HeadOfTheDepartment("Victoria",45,19,20_000,"UX/UI design","Computer Science");
                college[3] = Somebody1;
            }
            default: {
            System.out.println("\nPlease enter a valid choice");
            }
            System.out.println("All persons:");
            for(Person person : college){
                person.Show();
            }
        }
    }
}
