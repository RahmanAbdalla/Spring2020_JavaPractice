package Resourses;

class BreakTimeException extends RuntimeException{ // custom checked exception

    public BreakTimeException(){
        super("It's break time, we should take break");
    }

}

public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;

        if (breakTime) {

            throw new BreakTimeException();
        }else {
            System.out.println("Continue");
        }
    }
}
