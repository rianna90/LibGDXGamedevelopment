package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
	public static Texture background;
	public static Texture loadTexture (String file){
		return new Texture(Gdx.files.internal(file));
	}
		
	public static void load(){
		background = loadTexture("background.jpg");
	}

}




