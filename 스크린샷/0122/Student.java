/*
 * 국어는 Checked Exception, 영어는 Unchecked Exception
 */
public class Student {
	private int kor, eng;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) throws KoreanException{
		if(kor >= 0 && kor <= 100) this.kor = kor;
		else throw new KoreanException(
				"국어 점수는 0 ~ 100점까지입니다. \n확인 후 다시 입력하세요.");
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) throws EnglishException{
		if(eng >= 0 && eng <= 100) this.eng = eng;
		else throw new EnglishException(
				"영어점수는 0 ~ 100점까지입니다. \n확인 후 다시 입력해 주세요.");
	}
	
}



