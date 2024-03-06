package com.programming.app.datastructure.UEC;

/**
 * Lutador
 */
public class Lutador {
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    setPeso(peso);
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
  }

  public void apresentar() {
  }

  public void status(){
  }

  public void ganharLuta() {
  }

  public void perderLuta() {
  }

  public void empatarLutar() {
  }

  private String getNome() {
    return nome;
  }
  
  private void setNome(String nome) {
    this.nome = nome;
  }

  private String getNacionalidade() {
    return nacionalidade;
  }

  private void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  private int getIdade() {
    return idade;
  }

  private void setIdade(int idade) {
    this.idade = idade;
  }

  private float getAltura() {
    return altura;
  }

  private void setAltura(float altura) {
    this.altura = altura;
  }

  private float getPeso() {
    return peso;
  }

  private void setPeso(float peso) {
    this.peso = peso;
  }

  private String getCategoria() {
    return categoria;
  }

  private void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  private int getVitorias() {
    return vitorias;
  }

  private void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  private int getDerrotas() {
    return derrotas;
  }

  private void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  private int getEmpates() {
    return derrotas;
  }

  private void setEmpates(int empates) {
    this.empates = empates;
  }

}
