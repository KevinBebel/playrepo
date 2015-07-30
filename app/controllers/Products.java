package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;
import models.Product;
import views.html.products.*;
import play.data.Form;

public class Products extends Controller{
    private static final Form<Product> productForm = Form.form(Product.class);
    public  Result list(){
        List<Product> products = Product.findAll();
        return ok(list.render(products));
    }

    public  Result newProduct(){
        return TODO;
    }

    public  Result details(String ean){
        return ok(details.render(productForm));
    }

    public  Result save(){
        return TODO;
    }
}
