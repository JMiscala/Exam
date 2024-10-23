public class Exam {
    private String message;
    private String studentperiod;
    private String studentlevel;
    private double price;
    private boolean isFinished;

    Exam() { 
        // Constructor that assigns "Good luck" to message
        this.message = "Good luck";
    }
    
    Exam(String period, String level) {
        // Overloaded constructor
        this.studentperiod = period;
        this.studentlevel = level;
    }
    
    public double setPrice(double price) {
        // Sets the price and returns it
        this.price = price;
        return this.price;
    }
    
    public boolean setisFinished(boolean finish) {
        // Sets the finished status and returns it
        this.isFinished = finish;
        return this.isFinished;
    }

    public static void main(String[] args) { 
        // Create an instance of Quiz to see the output
        Quiz quiz = new Quiz();

        boolean studentStatus = false;
        double tuitionFee = 10000;

        // Setting values using setters
        quiz.setisFinished(studentStatus);
        quiz.setPrice(tuitionFee);
    }
}

class Midterm extends Exam {
    Midterm() {
        // Constructor that calls the parent class constructor
        super();
        System.out.println("Exam has started.");
    }
}

class Essay extends Midterm {
    Essay() {
        // Constructor that calls the parent class constructor
        super();
        System.out.println("Essay has started");
    }
}

class Quiz extends Essay {
    Quiz() {
        // Constructor that calls the parent class constructor
        super();
        System.out.println("Quiz has started");
    }
}
