package org.xproce.demoadvanced.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.xproce.demoadvanced.dao.entities.Product;
import org.xproce.demoadvanced.service.ProductManager;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    private ProductManager productManager;
    // get index

    @GetMapping("/index")
    public String accceuil(Model model) {
        List<Product> products = productManager.getAllProduct();
        model.addAttribute("listProduits", products);
        return "index";
    }

    @GetMapping("")
    public String accceuil1() {
        return "redirect:/index";
    }


    //get details product

    @GetMapping("detailsProduct")
    public String detailProduct(Model model,
                                @RequestParam(name = "id") Integer id) {

        Product product = productManager.getProductById(id);
        model.addAttribute("productWithDetails", product);
        return "detailProduit" ;

    }
    //get ajouterProduit


    //post ajouterProduit

    //

}
