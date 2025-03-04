package com.webmvc.homecontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webmvc.dao.LHLSanPhamDao;
import com.webmvc.users.LHLSanPham;

@Controller
public class LHLSanPhamServlet {

    @Autowired
    LHLSanPhamDao spdao;

    @RequestMapping("/viewsanpham")
    public String viewemp(Model m) {
        List<LHLSanPham> list = spdao.getEmployees();
        m.addAttribute("list", list);
        return "viewsanpham";
    }

    @RequestMapping(value = "/sua/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable int id, Model m) {
        LHLSanPham sanpham = spdao.getEmpById(id);
        m.addAttribute("user", sanpham);
        return "editsanpham";
    }

    @RequestMapping(value = "/luu", method = RequestMethod.POST)
    public String luu(@ModelAttribute("user") LHLSanPham user) {
        spdao.update(user);
        return "redirect:/viewsanpham";
    }

    @RequestMapping(value = "/xoa/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        spdao.delete(id);
        return "redirect:/viewsanpham";
    }

    // GET method for showing the form to add a new product
    @RequestMapping(value = "/them", method = RequestMethod.GET)
    public String showAddForm(Model m) {
        m.addAttribute("user", new LHLSanPham());  
        return "addsanpham";
    }

    @RequestMapping(value = "/them", method = RequestMethod.POST)
    public String addNewProduct(@ModelAttribute("user") LHLSanPham user, BindingResult result, Model m) {
        // Kiểm tra nếu tên sản phẩm bị null hoặc rỗng
        if (user.getLhl_tensp() == null || user.getLhl_tensp().trim().isEmpty()) {
            m.addAttribute("errorMessage", "Ten san pham khong duoc de trong!");
            return "addsanpham"; // Quay lại trang nhập liệu
        }

        // Nếu hợp lệ, lưu vào cơ sở dữ liệu
        spdao.save(user); 
        return "redirect:/viewsanpham"; 
    }
}
