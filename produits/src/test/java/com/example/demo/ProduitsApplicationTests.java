package com.example.demo;
import java.util.List;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entities.Produit;
import com.example.demo.repos.ProduitRepository;


@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private ProduitRepository produitRepository;
@Test
public void testCreateProduit() {
Produit prod = new Produit("PC Dell",2200.500,new Date());
produitRepository.save(prod);
}
@Test
public void testFindProduit()
{
Produit p = produitRepository.findById(1L).get();

System.out.println(p);
}
@Test
public void testUpdateProduit()
{
Produit p = produitRepository.findById(1L).get();
p.setPrixProduit(1000.0);
produitRepository.save(p);
}
@Test
public void testDeleteProduit()
{
produitRepository.deleteById(1L);;
}

@Test
public void testListerTousProduits()
{
List<Produit> prods = produitRepository.findAll();
for (Produit p : prods)
{
System.out.println(p);
}

}
}