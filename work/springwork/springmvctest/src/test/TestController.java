package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		StringBuffer dan = new StringBuffer();
		for(int i=1;i<10;i++) {
			dan.append(9+"*"+i+"="+(9*i)+"<br/>");
		}
		mav.addObject("gugu", dan);
				
		mav.setViewName("WEB-INF/test/result.jsp");
		return mav;
	}

}
