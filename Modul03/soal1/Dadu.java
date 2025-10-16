package soal1;
import java.util.Random; 

public class Dadu {     
	private int nilai; 
 
    public Dadu() {        
    	this.acakNilai(); 
    } 
 
    private void acakNilai() {         
    	Random random = new Random();         
    	this.nilai = random.nextInt(6) + 1; 
    } 
 
    public int getNilai() {         
    	return this.nilai; 
    } 
} 
	