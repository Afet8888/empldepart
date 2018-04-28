package az.itstep.azjava.testapp.Controller;

import az.itstep.azjava.testapp.model.Employee;
import az.itstep.azjava.testapp.model.dto.EmployeeDTO;
import az.itstep.azjava.testapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")

public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> findAll() {
        return employeeService.findAll();
    }

    @PostMapping
    public Employee save(@RequestBody Employee employees) {
        return employeeService.save(employees);
    }

    @PutMapping
    public Employee update(@RequestBody Employee employees) {
        return employeeService.update(employees);
    }

    @GetMapping("/{id}")
    public EmployeeDTO findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.delete(id);
    }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
