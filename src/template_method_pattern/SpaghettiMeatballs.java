package template_method_pattern;

public class SpaghettiMeatballs extends PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("Adding pasta in SpaghettiMeatballs");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding sauce in SpaghettiMeatballs");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding protein in SpaghettiMeatballs");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding garnish in SpaghettiMeatballs");
    }
}
