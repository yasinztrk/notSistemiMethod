public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    int avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;


    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 <= 100 && note1 >= 0) {
            c1.note = note1;
        }
        if (note2 <= 100 && note2 >= 0) {
            c2.note = note2;
        }
        if (note3 <= 100 && note3 >= 0) {
            c3.note = note3;
        }
        ;

    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
        if (this.avarage >= 50) {
            System.out.println("Sınıfı Başarıyla Geçtiniz");

        } else {
            System.out.println("Maalesef Kaldınız...");
        }printNote();
    }


    void printNote() {
        System.out.println(c1.name + " Notu :" + c1.note);
        System.out.println(c2.name + " Notu :" + c2.note);
        System.out.println(c3.name + " Notu :" + c3.note);
        System.out.println("Ortalamanız :" + this.avarage);

    }
}
