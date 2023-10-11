package com.smhrd.player.converter;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class ImageToBase64 implements PlayerImageConverter<File, String>{
	
	// 이미지파일을 byte문자열 형태로 변환할 때 base64(이미지 기본 인코딩방식)
	@Override
	public String converte(File f) throws IOException {
		
		// 1. 파일 가져오기 => commons-io라이브러리
		// commons-io 라이브러리 : 파일, 디렉토리 조작, 입출력, 파일 필터링...
		
		// 파일을 가져와서 byte 배열형태로 읽어주는 메소드
		// 어떻게 읽어주나? 픽셀하나하나를 byte로 변경한뒤 배열형태로 반환해주는것
		byte[] file = FileUtils.readFileToByteArray(f);
		
		// 2. byte배열 -> base64로 인코딩(문자열로 변환)
		String result_file = Base64.getEncoder().encodeToString(file);
		
		return result_file;
	}

}
