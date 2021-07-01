import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Vagas{
    private String tipoCarro;
    int valor=0;
    int valorprov=0;
    private String placas;
    LocalDateTime inicio;
    LocalDateTime momento;
    LocalDateTime fim;
    long diferenca;
    long diferencam;
    public void setCarro(String modelo){
        tipoCarro = modelo;
    }
    public String getCarro(){
        return tipoCarro;
    }
    public void setPlacas(String placa){
        placas = placa;
    }
    public String getPlacas(){
        return placas;
    }
    public void calcularValor(){
        fim = LocalDateTime.now();
        diferenca = inicio.until(fim, ChronoUnit.HOURS);
        for(int i=0;i<diferenca;i++){
            valor=valor+5;}
        System.out.println("O tempo estacionado foi de "+diferenca+" Horas");
        System.out.println("O valor a se pagar é de:"+valor);
        tipoCarro="vazio";
        placas="vazio";
        diferencam=0;
        valor=0;
        valorprov=0;
        inicio=LocalDateTime.now();
        momento = LocalDateTime.now();
        }
    public void guardarCarro(){
        inicio = LocalDateTime.now();
    }
    public void mostrarVaga(){
        momento = LocalDateTime.now();
        diferencam = ChronoUnit.HOURS.between(momento, inicio);
        for(int i=0;i<=diferencam;i++){
            valorprov=valorprov+5;
        System.out.println("Modelo: "+getCarro());
        System.out.println("Placa: "+getPlacas());
        System.out.println("Tempo atual na vaga: "+diferencam+" Horas");
        System.out.println("Valor a se pagar no momento: "+valorprov+" Reais\n");
        }
    }
}