package template_method_pattern;

public abstract class PastaDish {
    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    private void boilWater() {
        System.out.println("Boiling water in super class, as boiling water procedure is always same :3");
    }

    protected abstract void addPasta();

    private void cookPasta() {
        System.out.println("Cooking pasta in super class, as boiling water procedure is always same :3");
    }

    private void drainAndPlate() {
        System.out.println("Draining in super class, as boiling water procedure is always same :3");
    }

    protected abstract void addSauce();

    protected abstract void addProtein();

    protected abstract void addGarnish();
}
