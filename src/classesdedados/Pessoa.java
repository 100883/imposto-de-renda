/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesdedados;
/**
 *
 * @author Gui Freitas
 */
abstract class Pessoa {
    //Atribútos
    protected String nome = "";
    protected String endereco = "";
    protected int fone = 0;
    protected String email = "";
    protected float rendaBruta = 0;
    
    //Métodos 
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getFone() {
        return fone;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setFone(int fone) {
        this.fone = fone;
    }
    public void setEmail(String email) {
        this.email = email;
    }     
    public float getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    public abstract float calcularImpostoRenda();

 
}
