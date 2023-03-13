package programsNumbersPrint;

import org.apache.commons.lang3.RandomStringUtils;

public class RandamEmailIDGenral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genratingString = RandomStringUtils.randomAlphabetic(8);
		String email = genratingString+"@gmail.com";
		
		System.out.println(email);
	}

}
