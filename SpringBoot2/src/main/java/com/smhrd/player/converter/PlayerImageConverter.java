package com.smhrd.player.converter;

import java.io.File;
import java.io.IOException;

//  PlayerImageConverter<F,S> : 파일(F)을 문자열로(S)
public interface PlayerImageConverter<F,S> {

	// 이미지파일을 바이트문자열 형태로 변환할때 해당 인터페이스를 상속받아서
	// 정해진 틀대로 변환 할 수 있도록 진행
	
	
	// F: 실제파일 S: 바이트 문자열 throw : 예외처리
	// IOException : 입출력
	public S converte(F f) throws IOException;
	
}
