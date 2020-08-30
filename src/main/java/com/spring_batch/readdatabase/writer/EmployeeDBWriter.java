package com.spring_batch.readdatabase.writer;

import com.spring_batch.readdatabase.model.Employee;
import com.spring_batch.readdatabase.repo.EmployeeRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDBWriter implements ItemWriter<Employee> {
@Autowired
private EmployeeRepo employeeRepo;
@Override
public void write(List<? extends Employee> employees) throws Exception {
        employeeRepo.saveAll(employees);
        System.out.println("inside writer " + employees);
        }
}
