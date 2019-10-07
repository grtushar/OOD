package template_method_pattern;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        PastaDish sphaghettiMeatballs = new SpaghettiMeatballs();
        sphaghettiMeatballs.makeRecipe();
    }
}
