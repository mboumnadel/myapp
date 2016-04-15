/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.ProductsDAO;
import java.util.List;
import model.Products;


import java.util.*; 

import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.ActionContext;


/**
 *
 * @author mboumnadel
 */
public class ProductsController extends ActionSupport {

    public String message = "global MSG";
    
    public String execute() throws Exception {
        
        int start = 0;
        int maxRows = 10;
        List<Products> prods = ProductsDAO.getProducts(start, maxRows);

        
        String me = prods.get(0).getProductCode();

        Products prod = prods.get(0);
        
        String message = "ALLO";

        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();

      context.put("prod", prod); 
      //context.put("key1", new String("This is key1")); 
      stack.push(context);
        
        return SUCCESS;
    }
    public void setMessage(String msg){
    }
    public String getMessage(){
        return "Alo GetMessAge";
    }
}

