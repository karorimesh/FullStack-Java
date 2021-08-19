public class IfElseIfLadderExample {
    public static void main(String[] args) {
        int score = 81;
        if (score < 55) {
            System.out.println("fail");
        }
        else if(score >= 55 && score < 65){
            System.out.println("C grade");
        }
        else if(score >= 65 && score < 75){
            System.out.println("C+ grade");
        }
        else if(score >= 75 && score <80){
            System.out.println("B grade");
        }
        else if(score >= 80 && score <85) {
            System.out.println("A- grade");
        }
        else if(score >= 85 && score <90) {
            System.out.println("A grade");
        }
        else{
            System.out.println("A grade");
        }

    }
}
