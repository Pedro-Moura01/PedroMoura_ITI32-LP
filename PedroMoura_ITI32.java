
package pedromoura_iti32;

/**
 *
 * @author Aluno
 */
public class PedroMoura_ITI32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro = new Carro("Toyota","Corolla");
    }
    
}

class Carro{
    private String marca;
    private String nome;
    public Carro (String marca,String nome){
        this.marca = marca;
        this.nome = nome;
    }
    public void andar(){
        System.out.println("O carro " + marca + " " + nome + " está andando");
    }
}
