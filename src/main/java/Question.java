import java.util.Scanner;


public class Question {
  public String question;
  public int totalMarks;
  public String answer;
  public String studentAnswer;
  //constructor
  public Question(String question, int totalMarks, String answer) {
    this.question = question;
    this.totalMarks = totalMarks;
    this.answer = answer;
    this.studentAnswer = "";
  }

  //get question
    public void AskQuestion(Scanner inputScanner) {
    System.out.print(question + " (" + totalMarks + " marks) ");
    System.out.print("Your Answer: " + this.studentAnswer);
    String studentinput = inputScanner.nextLine();
    this.studentAnswer = studentinput;
  }
  //check answer, case sensitive and exact match.
  public int CheckAnswer() {
    if (!this.studentAnswer.equals(this.answer)) {
      return 0;
    }
    return this.totalMarks;

  }
}