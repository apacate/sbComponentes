package services;

public class TaxBrazil extends TaxService {
    public double tax(double amount) {
        return amount * 0.5;
    }
}
