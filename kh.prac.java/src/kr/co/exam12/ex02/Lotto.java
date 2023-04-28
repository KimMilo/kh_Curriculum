package kr.co.exam12.ex02;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int id;
    private int numbers[];
    private int bonus;
    
    public Lotto(int id) {
        this.id = id;
        this.numbers = new int[7];
    }
    
    public void generate() {
        Random rand = new Random();
        for(int i = 0; i < numbers.length;) {
            int num = rand.nextInt(46) + 1;
            boolean duplicate = false;
            for(int j = 0; j < i; j++) {
                if(this.numbers[j] == num) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                this.numbers[i] = num;
                i++;
            }
        }
        this.bonus = this.numbers[this.numbers.length - 1];
        this.numbers = Arrays.copyOf(this.numbers, 6);
    }
    
    public String getLotto() {
        String str = "" + this.id + " 회차: ";
        for(int i = 0; i < this.numbers.length; i++) {
            str += this.numbers[i] + ", ";
        }
        return str + this.bonus;
    }
}
