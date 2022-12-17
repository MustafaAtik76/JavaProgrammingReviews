package week15_12_17_2022.is_a_has_a;

public class ScrumTeam {
    //Scrum Team HAS A tester
    Tester tester;
    // Scrum Team HAS A developer
    Developer deleloper;

    public ScrumTeam(Tester tester, Developer deleloper) {
        this.tester = tester;
        this.deleloper = deleloper;
    }


}
