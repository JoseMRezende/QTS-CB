package br.com.facens.qts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Marcos
 * @version 1.1
 * @since Release 1.0 da aplicação
 *
 * A classe Conta representa uma conta bancária e contém métodos relacionados a operações financeiras.
 */
public class Conta {
    private int saldo;
    private boolean especial;
    private List<Integer> transferencias = new ArrayList<>();

    /**
     * Inicializa uma conta especial com um saldo inicial.
     *
     * @param saldo O saldo inicial da conta especial.
     */
    @Given("Um cliente especial com saldo de {int} reais")
    public void um_cliente_especial_com_saldo_de_reais(int saldo) {
        this.especial = true;
        this.saldo = saldo;
    }

    /**
     * Processa um saque na conta.
     *
     * @param saque O valor a ser sacado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(int saque) {
        this.sacar(saque);
    }

    /**
     * Verifica se o saque foi efetuado com sucesso e atualiza o saldo da conta.
     *
     * @param saldo O novo saldo da conta após o saque.
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int saldo) {
        assert this.saldo == saldo;
    }

    /**
     * Verifica outros resultados da operação.
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        assert this.especial;
    }

    /**
     * Inicializa uma conta comum com um saldo inicial.
     *
     * @param saldo O saldo inicial da conta comum.
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(int saldo) {
        this.especial = false;
        this.saldo = saldo;
    }

    /**
     * Processa a solicitação de saque na conta comum.
     *
     * @param saque O valor a ser sacado.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(int saque) {
        this.sacar(saque);
    }

    /**
     * Verifica se o saque não foi efetuado e retorna a mensagem de Saldo Insuficiente.
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem de Saldo Insuficiente")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_de_saldo_insuficiente() {
        assert this.transferencias.isEmpty();
    }

    /**
     * Realiza a transferência de um valor da conta, se possível.
     *
     * @param valor O valor a ser transferido.
     * @return true se a transferência for possível, false caso contrário.
     */
    public boolean transferir(int valor) {
        return this.especial || this.saldo >= valor;
    }

    /**
     * Processa o saque na conta, atualizando o saldo e registrando a transferência.
     *
     * @param v1 O valor a ser sacado.
     */
    public void sacar(int v1) {
        if (this.transferir(v1)) {
            this.saldo -= v1;
            this.transferencias.add(v1);
        } else {
            System.out.println("Falta de saldo na conta");
        }
    }

}