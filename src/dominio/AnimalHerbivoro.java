
package dominio;
public class AnimalHerbivoro extends Animal{
    
    @Override
    public void alimentarse() {
        System.out.println("Los animales herbivoros comen plantas");
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
