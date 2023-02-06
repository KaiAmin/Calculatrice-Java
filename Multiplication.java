public class Multiplication extends Operation {

    public Multiplication(Expression op1,Expression op2){
      super(op1,op2);
    }

    public int valeur(){
      return this.getOperande1().valeur() * this.getOperande2().valeur();
    }
    public String toString(){
      return "Le resultat de la multiplication entre l'operande " + nombre1 + " et l'operande " + nombre2 + " est";
    }
  }
}
