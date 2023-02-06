public class Nombre extends Expression{
  private int valeurNombre;
  public Nombre(int valeur){
    this.valeurNombre = valeur;
  }
  public int valeur(){
    return this.valeurNombre;
  }

  public String toString(){
    return "" + this.valeurNombre;

}
}
