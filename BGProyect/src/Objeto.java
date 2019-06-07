/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class Objeto {
    
    private int dis;
    private int atk;
    private int def;
    
    public void francotirador(){
        this.dis = 5;
        this.atk = 5;
        this.def = 0;
    }
    
    public void rifle(){
        this.dis = 4;
        this.atk = 3;
        this.def = 0;
    }
    
    public void pistola(){
        this.atk = 2;
        this.dis = 3;
        this.def = 0;
    }
    
    public void escopeta(){
        this.dis = 2;
        this.atk = 4;
        this.def = 0;
    }
    
    public void cuchillo(){
        this.dis = 1;
        this.atk = 2;
        this.def = 0;
    }
    
    public void lanzaGranadas(){
        this.dis = 3;
        this.atk = 3;
        this.def = 0;
    }
    
    public void puño(){
        this.atk = 1;
        this.dis = 1;
        this.def = 0;
    }
    
    public void escudoAntibalas(){
        this.dis = 0;
        this.atk = 0;
        this.def = 3;
    }
    
    public void chalecoAntibalas(){
        this.def = 2;
        this.dis = 0;
        this.atk = 0;
    }
    
    public void corazaMetalica(){
        this.def = 2;
    }
    
    public void casco(){
        this.def = 1;
    }
    
    public int getDis(){
        return dis;
    }
    
    public void setDis(int dis){
        this.dis = dis;
    }
    
    public int getAtk(){
        return atk;
    }
    
    public void setAtk(int atk){
        this.atk = atk;
    }
    
    public int getDef(){
        return def;
    }
    
    public void setDef(int def){
        this.def = def;
    }
}
