package homework;

public class Instructor extends Person implements Teacher{


    public Instructor(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours;
        learner.learn(numberOfHoursPerLearner);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner l : learners){
            l.learn(numberOfHoursPerLearner);
        }
    }
}
