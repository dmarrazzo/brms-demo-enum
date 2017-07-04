package helper;

import java.util.ArrayList;
import java.util.List;

public class EnumDataSource {
	public List<String> getListOfCountries() {
		List<String> list = new ArrayList<String>();

		list.add("France");
		list.add("Italy");
		list.add("UK");

		return list;
	}

	public List<String> getListOfCities(String country) {
		List<String> list = new ArrayList<String>();

		switch (country) {
		case "France":
			list.add("Paris");
			list.add("Lyon");
			list.add("Marseille");
			break;
		case "Italy":
			list.add("Rome");
			list.add("Milano");
			list.add("Salerno");			
			break;
		case "UK":
			list.add("London");
			list.add("Birmingham");
			list.add("Manchester");			
			break;
		}

		return list;
	}
}
