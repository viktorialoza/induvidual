public class Main {
    public static void main(String[] args) {
        Library thg1 = new Library(300,30,"science fiction","LDUBGD" );
        Student thg2 = new Student(18,"Loza Vika",1,"computer science");
        Book thg3 = new Book("Atomic habits","James Clear",320,true);

        System.out.println("Information about class Library:");
        System.out.println("NumberOfBooks:" +thg1.numberOfBooks);
        System.out.println("Readers:" +thg1.readers);
        System.out.println("TypeOfBooks:" +thg1.typeOfBooks);
        System.out.println("Location:" +thg1.location);

        System.out.println("Information about class Student:");
        System.out.println("Age:" +thg2.age);
        System.out.println("Name:" +thg2.name);
        System.out.println("Course:" +thg2.course);
        System.out.println("Profession:" +thg2.profession);

        System.out.println("Information about class Book:");
        System.out.println("Title:" +thg3.title);
        System.out.println("Author:" +thg3.author);
        System.out.println("NumberOfPages:" +thg3.numberOfPages);
        System.out.println("IsBorrowed:" +thg3.isBorrowed);

    }
}
