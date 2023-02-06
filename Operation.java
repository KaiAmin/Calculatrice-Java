public abstract class Operation extends Expression{
  public Expression nombre1;
  public Expression nombre2;


  public Operation(Expression op1, Expression op2){
    this.nombre1 = op1;
    this.nombre2 = op2;
  }

  public Expression getOperande1(){
    return this.nombre1;
  }
  public Expression getOperande2(){
    return this.nombre2;
  }

}
