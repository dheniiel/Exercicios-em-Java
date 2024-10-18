package exercicio_4;

public class Conta {

    int numero;
    String nomeProprietario;
    double saldo;
    double limite;

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return true;
        } else if (valor <= (this.saldo + this.limite)) {
            double diferenca = valor - this.saldo;
            this.saldo = 0;
            this.limite = this.limite - diferenca;
            return true;
        }
       return false;
    }

    boolean depositar(double valor) {
        this.saldo = this.saldo + valor;
        return true;
    }
}
