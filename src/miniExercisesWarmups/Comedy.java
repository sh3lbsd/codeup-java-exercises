package miniExercisesWarmups;

public class Comedy extends MovieWarmup {
    protected boolean funny;

    public Comedy(String name, String director, boolean isFunny) {
        super(name, director);
        this.funny = isFunny;
    }
}
