/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author hypoc
 */
public class Personaje {
    
    private Objeto obj;
    private int mov;
    
    public Personaje(Objeto obj){
        this.mov = calcularRandom();
        this.obj = obj;
    }
    
    public int calcularRandom(){
        Random azar = new Random();
        return azar.nextInt(6)+1;
    }

    public Objeto getObj() {
        return obj;
    }

    public void setObj(Objeto obj) {
        this.obj = obj;
    }

    public int getMov() {
        return mov;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }
    
    
    
}
