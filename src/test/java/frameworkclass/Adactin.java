package frameworkclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.framework.BaseClass;

public class Adactin {

	public static void main(String[] args) throws IOException {
		BaseClass bc = new BaseClass();

		bc.driverLaunch();
		bc.implicitwait(30);
		bc.get("http://adactinhotelapp.com/");
		bc.maximize();
		WebElement id = bc.locateElementById("username");
		String cell = bc.particularCell("Sheet2", 1, 0);
		bc.sendkey(id, cell);
		WebElement pass = bc.locateElementById("password");
		String cell1 = bc.particularCell("Sheet2", 1, 1);
		bc.sendkey(pass, cell1);
		WebElement login = bc.locateElementById("login");
		bc.click(login);
		WebElement location = bc.locateElementById("location");
		String city = bc.particularCell("Sheet2", 4, 2);
		bc.selectByVisibleTextDD(location, city);
		WebElement hotel = bc.locateElementById("hotels");
		String hot = bc.particularCell("Sheet2", 2, 3);
		bc.selectByVisibleTextDD(hotel, hot);
		WebElement roomtype = bc.locateElementById("room_type");
		String romtype = bc.particularCell("Sheet2", 3, 4);
		bc.selectByVisibleTextDD(roomtype, romtype);
		WebElement numberOfRooms = bc.locateElementById("room_nos");
		String nofRooms = bc.particularCell("Sheet2", 2, 5);
		bc.selectByVisibleTextDD(numberOfRooms, nofRooms);
		WebElement entryDate = bc.locateElementById("datepick_in");
		bc.clear(entryDate);
		String eDate = bc.particularCell("Sheet2", 1, 6);
		bc.sendkey(entryDate, eDate);
		WebElement exitDate = bc.locateElementById("datepick_out");
		bc.clear(exitDate);
		String exDate = bc.particularCell("Sheet2", 1, 7);
		bc.sendkey(exitDate, exDate);
		WebElement Adult = bc.locateElementById("adult_room");
		String ad = bc.particularCell("Sheet2", 3, 8);
		bc.selectByVisibleTextDD(Adult, ad);
		WebElement Child = bc.locateElementById("child_room");
		String ch = bc.particularCell("Sheet2", 1, 9);
		bc.selectByVisibleTextDD(Child, ch);
		WebElement submit = bc.locateElementById("Submit");
		bc.click(submit);
		WebElement radioButton = bc.locateElementById("radiobutton_0");
		bc.click(radioButton);
		WebElement contiue = bc.locateElementById("continue");
		bc.click(contiue);
		WebElement firstName = bc.locateElementById("first_name");
		String fName = bc.particularCell("Sheet2", 1, 10);
		bc.sendkey(firstName, fName);
		WebElement lastName = bc.locateElementById("last_name");
		String lName = bc.particularCell("Sheet2", 1, 11);
		bc.sendkey(lastName, lName);
		WebElement address = bc.locateElementById("address");
		String add = bc.particularCell("Sheet2", 1, 12);
		bc.sendkey(address, add);
		WebElement cardNo = bc.locateElementById("cc_num");
		String cno = bc.particularCell("Sheet2", 1, 13);
		bc.sendkey(cardNo, cno);
		WebElement cardType = bc.locateElementById("cc_type");
		String ctype = bc.particularCell("Sheet2", 2, 14);
		bc.selectByVisibleTextDD(cardType, ctype);
		WebElement month = bc.locateElementById("cc_exp_month");
		String mon = bc.particularCell("Sheet2", 8, 15);
		bc.selectByVisibleTextDD(month, mon);
		WebElement year = bc.locateElementById("cc_exp_year");
		String yr = bc.particularCell("Sheet2", 12, 16);
		bc.selectByVisibleTextDD(year, yr);
		WebElement cvv = bc.locateElementById("cc_cvv");
		String cv = bc.particularCell("Sheet2", 1, 17);
		bc.sendkey(cvv, cv);
		WebElement bookNow = bc.locateElementById("book_now");
		bc.click(bookNow);
		WebElement orderNo = bc.locateElementById("order_no");
		String oNo = bc.getAttribute(orderNo);
		System.out.println(oNo);
		bc.writeValueCreateCell("Sheet2", 1, 18, oNo);

	}

}
