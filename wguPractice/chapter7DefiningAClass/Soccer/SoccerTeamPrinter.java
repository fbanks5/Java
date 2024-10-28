package wguPractice.chapter7DefiningAClass.Soccer;

public class SoccerTeamPrinter {
    public static void main(String[] args) {
        SoccerTeam teamFlorida = new SoccerTeam();
        TeamPerson headCoach = new TeamPerson();
        TeamPerson asstCoach = new TeamPerson();

        headCoach.setFullName("Coach Johnson");
        headCoach.setAgeYears(45);
        teamFlorida.setHeadCoach(headCoach);

        asstCoach.setFullName("Coach Smith");
        asstCoach.setAgeYears(35);
        teamFlorida.setAssistantCoach(asstCoach);

        teamFlorida.print();
    }
}
