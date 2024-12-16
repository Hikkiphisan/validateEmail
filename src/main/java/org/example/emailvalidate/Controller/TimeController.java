package org.example.emailvalidate.Controller;


import org.example.emailvalidate.Model.Customer;
import org.example.emailvalidate.Service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/world-clock")
    public String getTimeByTimezone(ModelMap modelMap, @RequestParam(name = "city",required = false,defaultValue = "Asia/Ho_Chi_Minh") String city) {
//       bat buoc phai co defaultValue, khong thi se bị loi
        Date date = new Date();
        TimeZone local = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);

        long localeTime = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
        date.setTime(localeTime);

        modelMap.addAttribute("city",city);
        modelMap.addAttribute("date",date);
        return "timecity";
    }




    @GetMapping("/showList")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }


    CustomerService customerService = new CustomerService();
    @GetMapping("/showList/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("infor");
        Customer customer = customerService.findbyId(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }



    @PostMapping("/showList")
    public String updateCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/showList";
    }


}
