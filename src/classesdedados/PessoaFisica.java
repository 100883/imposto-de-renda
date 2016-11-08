/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesdedados;

/**
 *
 * @author ManaimTI
 */
public class PessoaFisica extends Pessoa{
    
    public PessoaFisica(String nome, String endereco, int fone, String email, float rendaBruta) {
        super();
    }
    //Atributos
    private int Cpf = 0;
    private String sexo = "";
    
    //Metodos
    public int getCpf() {
        return Cpf;
    }
    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        float renda = this.getRendaBruta();
        
        if(renda <= 1400){
            return 0;
        }else
        if(renda > 1400 && renda <= 2100){
            return (float)(renda * 0.1);
        }else
        if(renda > 2100 && renda <= 2800){
            return (float)(renda * 0.15);
        }else
        if(renda > 2800 && renda <= 3600){
            return (float)(renda * 0.25);
        }
            //Maior que 3.600
            return (float)(renda * 0.3);
        }
    }
