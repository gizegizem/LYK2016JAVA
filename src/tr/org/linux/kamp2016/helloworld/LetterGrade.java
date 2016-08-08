package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class LetterGrade {

	public static void main(StringExample[] args) {
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;

		Scanner input = new Scanner(System.in);
		System.out
				.println("0-100 arası notları giriniz"
						+ " notları girdikten sonra harf notu dağılımını hesaplamak için"
						+ " UNİX türevleri için <CTRL D>"
						+ " Windows için <CTRL Z>" + "komutunu veriniz.");

		while (input.hasNext()) {
			int grade = input.nextInt();
			total += grade;
			++gradeCounter;
			switch (grade / 10) {
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default:
				++fCount;
				break;

			}

		}
		System.out.println("notların durumu: ");
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;
			System.out.println(gradeCounter + "adet notun toplamı: "+total);
			System.out.println(gradeCounter + "adet notun ortalaması: "+average);
			System.out.println("harf notlarına göre öğrenci sayısı " + "A:"
					+ aCount + " B:" + bCount + " C:" + cCount + " D:" + dCount
					+ " F:" + fCount);

		}
		else
			System.out.println("Not girilmedi.");

	}

}
