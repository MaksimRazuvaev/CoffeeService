package controlers;

import models.Product;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import services.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ProductController implements Controller {

    private ProductService ProductService;

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<Product> productsFromService = ProductService.getAllProduct();
        Product productFromService = ProductService.getProductByCategoryId(1);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("productIndex");
        modelAndView.addObject("productsForJsp", productsFromService);
        // "?" modelAndView.addObject("productsForJsp", productFromService);
        return modelAndView;
    }

    /*public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<Product> productFromService = ProductService.getProductByCategoryId(int categoryId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("productIndex");
        modelAndView.addObject("productsForJsp", productFromService);
        return modelAndView;
    }*/
}
