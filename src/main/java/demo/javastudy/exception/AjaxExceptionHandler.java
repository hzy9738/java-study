package demo.javastudy.exception;
import javax.servlet.http.HttpServletRequest;

import demo.javastudy.pojo.JSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



//@RestControllerAdvice
public class AjaxExceptionHandler {

    //	@ExceptionHandler(value = Exception.class)
    public JSONResult defaultErrorHandler(HttpServletRequest req,
                                          Exception e) throws Exception {

        e.printStackTrace();
        return JSONResult.errorException(e.getMessage());
    }
}
