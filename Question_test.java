import java.util.Random;
public class Question_test {
     public static void main(String []args) {
    	 Random rand = new Random();
    	 int qn = rand.nextInt(20);
    	 Questions rq = new Questions();
    	 rq.startQuestions(qn); 
     }
}
