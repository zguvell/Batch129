package day30exceptionsinterface;

public class CustomExceptions01 {

    public static void main(String[] args) {

    getStudentGrade(98);

    getTheNumberOfStudents(24);

    }

    public static void getStudentGrade(int grade){

        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than hundred");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println(grade);
        }
    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println(numOfStudents);
        }
    }
}
