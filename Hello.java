public class Hello
{
    public static void main(String[] s)
    {
        System.out.println("hello world");
        Student Stu =new Student();
        Stu.displayName("ben", 12);

    }
}

class Student
{
    public void displayName(String name,int age)
    {
        System.out.println("name: "+name+"\nage: "+age);
    }
}