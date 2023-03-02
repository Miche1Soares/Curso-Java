package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
    
    public double filterredSum(List<Product> list, Predicate<Product> criteria)
    {
        double sum = 0.0;
        for(Product p : list)
        {
            // testa uma condição genérica que será posteriormente recebida como parâmetro
            if(criteria.test(p))
            {
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
