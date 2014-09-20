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
    Druggist druggist = new Druggist();
    Recipe recipe = new Recipe();

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
     

    public MedicamentStory() {
    }


    
    
}
