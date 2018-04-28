package az.itstep.azjava.testapp.Controller;

import az.itstep.azjava.testapp.model.Department;
import az.itstep.azjava.testapp.model.dto.DepartmentDTO;
import az.itstep.azjava.testapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")

public class DepartmentController {

    private DepartmentService departmentService;

    @GetMapping
    public List<DepartmentDTO> findAll() {
        return departmentService.findAll();
    }

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @PutMapping
    public Department update(@RequestBody Department department) {
        return departmentService.update(department);
    }

    @GetMapping("/{id}")
    public DepartmentDTO findById(@PathVariable Integer id) {
        return departmentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        departmentService.delete(id);
    }

    @Autowired
    public void setEmployeeService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
}
