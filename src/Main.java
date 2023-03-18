
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "000");
        Teacher t2 = new Teacher("Sedat Hoca ", "FZK", "555");
        Teacher t3 = new Teacher("Ahmet Hoca", "BİO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        // tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        // fizik.addTeacher(t2);
        Course bio = new Course("BİYO", "103", "BİO");
        // bio.addTeacher(t2);

        Student s1 = new Student("Yasin", "80", "5", tarih, fizik, bio);
        s1.addBulkExamNote(50, 60, 10);
        s1.isPass();


    }
}