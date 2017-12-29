package com.spring51.jstl;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class jstlController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);
    
    @RequestMapping(value = "/jstl/jstl01", method = RequestMethod.GET)
    public String jstl01(Model model) {
        logger.info("jstl01");
        
        return "jstl/jstl01";
    }
    
    @RequestMapping(value = "/jstl/jstl02", method = RequestMethod.GET)
    public String jstl02(Model model) {
        logger.info("jstl02");
        
        int num1 = 7;
        int num2 = 9;
        
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        
        return "jstl/jstl02";
    }
    
    @RequestMapping(value = "/jstl/jstl03", method = RequestMethod.GET)
    public String jstl03(Model model) {
        logger.info("jstl03");
        
        return "jstl/jstl03";
    }
    
    @RequestMapping(value = "/jstl/jstl11", method = RequestMethod.GET)
    public String jstl11(Model model) {
        logger.info("jstl11");
        
        return "jstl/jstl11";
    }
    
    @RequestMapping(value = "/jstl/jstl12", method = RequestMethod.GET)
    public String jstl12(Model model) {
        logger.info("jstl12");
        
        return "jstl/jstl12";
    }
    
    @RequestMapping(value = "/jstl/jstl21for", method = RequestMethod.GET)
    public String jstl21for(Model model) {
        logger.info("jstl21for");
        
        return "jstl/jstl21for";
    }
    
    @RequestMapping(value = "/jstl/jstl22foreach", method = RequestMethod.GET)
    public String jstl22foreach(Model model) {
        logger.info("jstl22foreach");
        /* ====String 배열===== */
        String[] arr = { "순두부", "된장찌개", "제육덮밥" };
        model.addAttribute("array", arr);
        /* ====ArrayList 배열===== */
        List<String> arr1 = new ArrayList<String>();
        arr1.add("두부");
        arr1.add("찌개");
        arr1.add("덮밥");
        
        model.addAttribute("list", arr1);
        
        return "jstl/jstl22foreach";
    }
    
    @RequestMapping(value = "/jstl/jstl23fortokens", method = RequestMethod.GET)
    public String jstl23fortokens(Model model) {
        logger.info("jstl23fortokens");
        
        model.addAttribute("member", "효성^^지은~선화/징거");
        return "jstl/jstl23fortokens";
    }
    
    @RequestMapping(value = "/jstl/jstl31includefile", method = RequestMethod.GET)
    public String jstl31includefile(Model model) {

    return "jstl/jstl31includefile";
    }
    @RequestMapping(value = "/jstl/jstl33import", method = RequestMethod.GET)
    public String jstl33import(Model model) {
    logger.info("jstl33import");

    return "jstl/jstl33import";
    }
    @RequestMapping(value = "/jstl/jstl41", method = RequestMethod.GET)
    public String jstl41(Model model) {
    logger.info("jstl41");

    return "jstl/jstl41";
    }
    @RequestMapping(value = "/jstl/jstl61", method = RequestMethod.GET)
    public String jstl61(Model model) {
    logger.info("jstl61");

    return "jstl/jstl61";
    } 
    @RequestMapping(value = "/jstl/jstl61sub", method = RequestMethod.GET)
    public String jstl61sub(Model model) {
    logger.info("jstl61sub");

    return "jstl/jstl61sub";
    }
    
}
