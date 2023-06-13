package oops_concepts.Encapsulation;

import javax.swing.plaf.metal.MetalButtonUI;

public class game {

   int score1;
    int score2;

    public int getScore1()
    {
        if(score1==50 || score1==60 || score1==70){
            return score1; }
        else {
            return score1= 0;
        }

    }
    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {

        if(score2==50 || score2==60 || score2==70){
            return score2;}
        else
        return score2=0;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public void total()
    {
       int total=score1+score2;
        System.out.println("the total is: "+total);
    }

//...................................................................................

    int number=25;

    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

//..........................................................................................................

   private String grade;

    public String getGrade() {
        if(grade =="70"){
           grade="C";
           return grade;
        }else if(grade=="80"){
            grade="B";
            return grade;
        }else if(grade=="90"){
            grade="A";
            return grade;
        }else
        return grade="F";
    }

    public void setGrade(String rate) {
        this.grade = rate;
    }
    //...........................................................................................................

    public static void main(String[] args) {
        game ga=new game();

        System.out.println(ga.name="jo");
    }

}
