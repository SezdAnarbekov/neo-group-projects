package solution_Files;

/**
 * Created by syezdsultanov on 11/6/17.
 */


class Mugalim {

}


public class Student extends Mugalim {
     Student run() {


        return ((Student)new Mugalim());
    }


    public static void main(String args[]) {
       Student student = new Student();
       student.run();



    }

}






