package Lesson1;

public class Course {
    String result;
    private int Run;
    private int HittingTheTarget;
    private int DeathStreak;
    private int Compass;

    public Course(int run, int hittingTheTarget, int deathStreak, int compass) {
        this.Run = run;
        this.HittingTheTarget = hittingTheTarget;
        this.DeathStreak = deathStreak;
        this.Compass = compass;
    }

    public String doIt(Team team) {
        result = "Team " + team.getName() + " " + '\n';
        for (Members Members: team.getPeoples()) {
        result += "Name of member " + Members.getName() + " " + '\n';
        int valueRun = Members.getMobility();
        int valueHit = Members.getDexterity();
        int valueStreak = Members.getHealth();
        int valueCompass = Members.getIntelligence();
        testRun(valueRun);
        testHittingTheTarget(valueHit);
        testDeathStreak(valueStreak);
        testCompass(valueCompass);
        }
        return result;
    }


    private void testRun(int valueRun){
    if (valueRun<Run) result = result + " Run. Obstacle not passed" + '\n';
    else result += "Run. Obstacle passed!!!" + '\n';
    }
    private void testHittingTheTarget(int valueHit){
        if (valueHit<HittingTheTarget) result = result + "Hitting The Target. Obstacle not passed" + '\n';
        else result += "Hitting The Target. Obstacle passed!!!" + '\n';
    }
    private void testDeathStreak(int valueStreak){
        if (valueStreak<DeathStreak) result = result + "DeathStreak. Obstacle not passed" + '\n';
        else result += "DeathStreak. Obstacle passed!!!" + '\n';
    }
    private void testCompass(int valueCompass){
        if (valueCompass<Compass) result = result + "Compass. Obstacle not passed" + '\n';
        else result += "Compass. Obstacle passed!!!" + '\n';
    }


}

