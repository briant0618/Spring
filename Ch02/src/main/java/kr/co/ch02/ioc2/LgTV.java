package kr.co.ch02.ioc2;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements Tv {

	@Inject
	private Speaker spk;
	
	@Override
	public void power() {
		System.out.println("LgTV - power...");
	}
	
	@Override
	public void chUp() {
		System.out.println("LgTV - chUp...");
	}
	
	@Override
	public void chDown() {
		System.out.println("LgTV - chDown...");
	}

	@Override
	public void soundUp() {
		spk.soundUp();
	}

	@Override
	public void soundDown() {
		spk.soundDown();
	}
}

