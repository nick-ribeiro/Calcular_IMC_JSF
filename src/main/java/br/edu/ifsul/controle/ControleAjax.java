package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named(value = "controleAjax")
@ViewScoped
public class ControleAjax implements Serializable{
    
    private double peso;
    private double alt;
    private double imc;
    private String classif;
    private Boolean exibir;

    public ControleAjax() {
        this.exibir = false;
    }
    
    public void processar()
    {
        this.imc = peso / (alt * alt);
        this.exibir = !exibir;
        
        System.out.println("Exibir Resultado: " + this.exibir);
        
        if(this.imc < 18.5) 
        {
            this.classif = "Magreza";
        }
        else if(this.imc >= 18.5 && this.imc < 25) 
        {
            this.classif = "Normal";
        } 
        else if(this.imc >= 25 && this.imc < 30) 
        {
            this.classif = "Sobrepeso";
        } 
        else if(this.imc >= 30 && this.imc < 40) 
        {
            this.classif = "Obesidade";
        } 
        else if(this.imc > 40) 
        {
            this.classif = "Obesidade Grave";
        }
        
    }
    
    public void Voltar() {
        this.peso = 0.0;
        this.alt = 0.0;
        this.imc = 0.0;
        this.classif = "";
        this.exibir = false;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassif() {
        return classif;
    }

    public void setClassif(String classif) {
        this.classif = classif;
    }

    public Boolean getExibir() {
        return exibir;
    }

    public void setExibir(Boolean exibir) {
        this.exibir = exibir;
    }
 
}
