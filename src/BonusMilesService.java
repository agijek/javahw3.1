public class BonusMilesService {
    public int calculate(int cost) {

        int accrualFormula = 20;

        int bonusMiles = cost / accrualFormula;

        return bonusMiles;
    }
}