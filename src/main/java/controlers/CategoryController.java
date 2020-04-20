package controlers;

import models.Category;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import services.CategoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class CategoryController implements Controller {

    private CategoryService categoryService;

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<Category> categoriesFromService = categoryService.getAllCategories();
        ModelAndView modelAndView = new ModelAndView();
        //This is a jsp file name
        modelAndView.setViewName("index");
        // Pass 1 veriable that will be use in jsp and 2 ModelAndView variable name
        modelAndView.addObject("categoriesForJsp", categoriesFromService);
        return modelAndView;
    }
}
