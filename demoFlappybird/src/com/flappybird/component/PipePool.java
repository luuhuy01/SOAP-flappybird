package com.flappybird.component;

import java.util.ArrayList;
import java.util.List;

import com.flappybird.util.Constant;


public class PipePool {
	private static final List<Pipe> pool = new ArrayList<>(); 
	private static final List<MovingPipe> movingPool = new ArrayList<>(); 
	public static final int MAX_PIPE_COUNT = 30; 
	public static final int FULL_PIPE = (Constant.FRAME_WIDTH
			/ (Pipe.PIPE_HEAD_WIDTH + GameElementLayer.HORIZONTAL_INTERVAL) + 2) * 2;

	static {
		for (int i = 0; i < PipePool.FULL_PIPE; i++) {
			pool.add(new Pipe());
		}
		for (int i = 0; i < PipePool.FULL_PIPE; i++) {
			movingPool.add(new MovingPipe());
		}
	}

	
	public static Pipe get(String className) {
		if ("Pipe".equals(className)) {
			int size = pool.size();
			if (size > 0) {
				return pool.remove(size - 1); 
			} else {
				return new Pipe(); 
			}
		} else {
			int size = movingPool.size();
			if (size > 0) {
				return movingPool.remove(size - 1); 
			} else {
				return new MovingPipe(); 
			}
		}
	}

	
	public static void giveBack(Pipe pipe) {

		if(pipe.getClass() == Pipe.class) {
			if (pool.size() < MAX_PIPE_COUNT) {
				pool.add(pipe);
			}
		}else {
			if (movingPool.size() < MAX_PIPE_COUNT) {
				movingPool.add((MovingPipe)pipe);
			}
		}
	}
}
