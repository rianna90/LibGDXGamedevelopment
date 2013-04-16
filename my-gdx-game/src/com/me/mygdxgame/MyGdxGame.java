package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture background;

	Music rainMusic;
	
	@Override
	public void create() {		
		
	    background = new Texture(Gdx.files.internal("background.jpg"));
	    rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));
	      
	    rainMusic.setLooping(true);
	    rainMusic.play();
		
	    camera = new OrthographicCamera();
	    camera.setToOrtho(false, 800, 480);
	    batch = new SpriteBatch();
	}


	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {		
	    camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		batch.draw(background, 0, 0, 800, 600, 0, 0, 800, 600, false, false);
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
