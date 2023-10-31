package dados_pessoas;

public class Pessoa{
    private char sexo;
    private double altura;
    
    public Pessoa(double altura, char sexo){
        this.altura = altura;
        this.sexo = sexo;
    }
    
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
}
