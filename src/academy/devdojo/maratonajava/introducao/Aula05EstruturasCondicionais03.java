package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args ) {
        //doar se o salario for maior que 5000
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não posso doar mas vou poder";
        String resultado;

        if (salario >= 5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    /// ///////////////////////////
        double grana = 30000;
        double doacao = grana/10;
        String mensagemDoar1 = "Eu vou doar: "+doacao;
        String mensagemNaoDoar1 = "Ainda não posso doar mas vou poder";

        String doaOuNao = grana > 5000 ?  mensagemDoar1: mensagemNaoDoar1 ;

        System.out.println(doaOuNao);
    }
}
