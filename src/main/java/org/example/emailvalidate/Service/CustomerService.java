package org.example.emailvalidate.Service;

import org.example.emailvalidate.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerService {

    // Giả lập một cơ sở dữ liệu bằng cách sử dụng Map
    private Map<Long, Customer> customerDatabase = new HashMap<>();

    // Constructor để thêm dữ liệu mẫu vào "cơ sở dữ liệu"
    public CustomerService() {
        customerDatabase.put(1L, new Customer(1L, "John Doe", "john@example.com","Hanoi"));
        customerDatabase.put(2L, new Customer(2L, "Jane Smith", "jane@example.com","Bac Ninh"));
    }




    // Phương thức để tìm kiếm khách hàng theo id
    public Customer findbyId(Long id) {
        return customerDatabase.get(id);
    }

    // Phương thức để lấy danh sách tất cả khách hàng (nếu cần)
    public List<Customer> findAll() {
        return new ArrayList<>(customerDatabase.values());
    }
    public void save(Customer customer) {
        if (customer.getId() == null) {
            // Nếu customer chưa có ID, sẽ tạo mới (thêm vào cơ sở dữ liệu)
            long newId = customerDatabase.size() + 1; // tạo id mới
            customer.setId(newId);
            customerDatabase.put(newId, customer);
        } else {
            // Nếu customer có ID, sẽ cập nhật thông tin khách hàng
            customerDatabase.put(customer.getId(), customer);
        }
    }


}
