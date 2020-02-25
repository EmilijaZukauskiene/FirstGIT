package lt.sdacademy.designpatterns.structural.behavioral.templatemethod.example;

public abstract class Pizza {

    public final void bakingPizza() {
        formingDough();
        addInredients();
        bakingDough();
        System.out.println("Pizza is baked.");
    }


    private void formingDough() {
        System.out.println("Forming dough");
    }

    protected abstract void addInredients();

    private void bakingDough() {
        System.out.println("Baking dough");
    }

}
