package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double tax = population*growthRate;
		tax+=.5*population;
		return tax;
	}

}
