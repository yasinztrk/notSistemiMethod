public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String branch,String mpno){
            this.name=name;
            this.branch=branch;
            this.mpno=mpno;



    }
    void print(){
        System.out.println("İsim :"+this.name);
        System.out.println("Branş :"+this.branch);
        System.out.println("Tel :"+this.mpno);

    }
}
