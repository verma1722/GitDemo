package qaclickacedemy.Mavenjava;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

public class Testsampledata {

	public static void main(String[] args) throws IOException {
		 Datadriven d=new Datadriven();
		ArrayList<String> data= d.getdata("Automation");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		//send data insuch a way to your test by read by excel export file and use as per abliablity of system
		//driver.findelement(By.xpath("")).sendkeys(data.get(0));
	}

}
