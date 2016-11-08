/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesdedados;
/**
 *
 * @author Gui freitas
 */
public class PessoaJuridica extends Pessoa{
    
    public PessoaJuridica(String nome, String endereco, int fone, String email, float rendaBruta) {
        super();
    }
    
    //Atributos
    private int Cnpj = 0;
    private String razaoSocial = "";
    
    //Metodos
    public int getCnpj() {
        return Cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setCnpj(int Cnpj) {
        this.Cnpj = Cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public String getEndereco() {
        return endereco;
    }
    @Override
    public int getFone() {
        return fone;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public float getRendaBruta() {
        return rendaBruta;
    }    
    @Override
     public float calcularImpostoRenda(){
        return (float)((this.getRendaBruta()/100) * 10);
    }
 
}
