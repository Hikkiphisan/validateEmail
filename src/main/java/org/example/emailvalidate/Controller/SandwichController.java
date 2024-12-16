package org.example.emailvalidate.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SandwichController {



    @RequestMapping("/showFormcheckboxSandwich")
    public String showForm(Model model) {
        // Danh sách gia vị cho sandwich
        String[] condiments = {"Lettuce", "Tomato", "Cheese", "Mustard", "Ketchup"};

        model.addAttribute("sample","Warning");
        // Thêm danh sách gia vị vào model
        model.addAttribute("condiments", condiments);

        return "showFormcheckboxSandwich"; // Trả về view index.jsp
    }


    @RequestMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiment) {
        if (condiment == null || condiment.length == 0) {
            // Không có gia vị nào được chọn
            System.out.println("No condiments selected.");
        } else {
            // Hiển thị các gia vị đã chọn
            System.out.println("Selected Condiments: ");
            for (String item : condiment) {
                System.out.println(item);
            }
        }
        return "listselectedFlavorTopping"; // Chuyển đến trang kết quả
    }


//    @ModelAttribute("condiments")
//    public String[] getCondiments() {
//        return new String[]{"Lettuce", "Tomato", "Cheese", "Mustard", "Ketchup"};
//    }
}