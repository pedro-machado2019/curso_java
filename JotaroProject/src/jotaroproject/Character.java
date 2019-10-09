package jotaroproject;

import java.util.Random;

public class Character {
    
    String nome;
    String raca;
    String classe;
    String sexo;
    int hp_atual, hp_max;
    int level;
    
    Character(String nome, String sexo, String raca, String classe, int hp, int level){
    this.nome = nome;
    this.sexo = sexo;
    this.raca = raca;
    this.classe = classe;
    this.hp_atual = hp;
    this.hp_max = hp;
    this.level = level;
    //Inventario mochila = new Inventario();
    
    if(sexo == "M"){
        System.out.println(this.nome + " é um " + this.raca + " " + this.classe + " de nível " + this.level);
        System.out.println("- O HP máximo de " + this.nome + " é " + this.hp_max);
        System.out.println("- O HP atual de " + this.nome + " é " + this.hp_atual + "\n");
    }
    if(sexo == "F"){
        System.out.println(this.nome + " é uma " + this.raca + " " + this.classe + " de nível " + this.level);
        System.out.println("- O HP máximo de " + this.nome + " é " + this.hp_max);
        System.out.println("- O HP atual de " + this.nome + " é " + this.hp_atual + "\n");
    }
    }
    
    //métodos
    
    void hit(int dano){
        System.out.println(this.nome + " sofreu " + dano + " de dano ");
        this.hp_atual -= dano;
        
        if(dano > this.hp_max * 2){
            System.out.println(this.nome + " está morto...");
        } else if(this.hp_atual <= 0){
            System.out.println(this.nome + " está inconsciente!");
        } else{
            System.out.println(this.nome + " tem " + this.hp_atual + " pontos de vida restantes");
        }
    }
    

    
    void atacar(Character alvo, int dano){
        Random r = new Random();
        int d20 = r.nextInt(20) + 1;
        System.out.println(this.nome + " ataca " + alvo.nome);
        alvo.hit(dano);
    }
    
    void criado(){
        System.out.println("Personagem criado");
    }
    
    void subir_de_nivel(int lvl){
        level = lvl;
    }
}
