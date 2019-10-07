package template_method_pattern;

public class PenneAlfredo extends PastaDish {
    @Override
    protected void addPasta() {
        System.out.println("Adding pasta in PenneAlfredo");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding sauce in PenneAlfredo");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding protein in PenneAlfredo");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding garnish in PenneAlfredo");
    }
}
