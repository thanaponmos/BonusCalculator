
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setBonus(int n){

		System.out.println("Employee "+n+" PlusBonus :"+(bonusCalculator.computeBonus(n)));
	}
	
	
	
}
