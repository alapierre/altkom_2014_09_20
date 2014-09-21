/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**
 *
 * @author student
 */
public class MedicamentStory {


    private Druggist druggist;
    private Recipe recipe;
    /*lekarstwo*/
    private int count;/*ilosc lekarstw*/
    
    
    public MedicamentStory() {
    }

    public MedicamentStory(Druggist druggist, Recipe recipe, int Count) {
        this.druggist = druggist;
        this.recipe = recipe;
        this.count = Count;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int Count) {
        this.count = count;
    }
        


   public Druggist getDruggist() {
        return druggist;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setDruggist(Druggist druggist) {
        this.druggist = druggist;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "MedicamentStory{" + "druggist=" + druggist + ", recipe=" + recipe + '}';
    }
    
}
