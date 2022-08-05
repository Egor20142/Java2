package lesson1;

public class main {
public static void main(String[] args){
    Team DreamTeam = Team("DreamTeam", new Team [] {
            new Igor(10, 55,22),
            new Egor(11, 5 ,6 ),
            new lena(45, 10, 20),
            new vlad(15, 22,88)});
    Course course = new Course(new int[]{10,20,5});

    team.memberOfTheTeam();
    course.doIt(team);
    team.showResults();

}
}