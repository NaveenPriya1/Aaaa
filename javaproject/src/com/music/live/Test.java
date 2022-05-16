package com.music.live;

import com.music.Playable;
import com.music.string.Veena;
import com.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		v.play();
		Saxophone p =new Saxophone();
		p.play();
		
		
		
		Playable p1=new Veena();
		p1.play();
		
		Playable p2;
		
		p2 = new Veena();
		p2.play();
		
		

	}

}
