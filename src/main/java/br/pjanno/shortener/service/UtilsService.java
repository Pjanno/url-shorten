package br.pjanno.shortener.service;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.stereotype.Service;

@Service
public class UtilsService {
	
	public String encode (String text) throws Exception {
		
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(text.getBytes(),0,text.length());
		String output = "MD5: "+new BigInteger(1,m.digest()).toString(16);
		return output;
		
    }
	
}
