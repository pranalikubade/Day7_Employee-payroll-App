package com.bridgelabz.Employee.Payroll.App.Repository;

import com.bridgelabz.Employee.Payroll.App.Model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Long> {
}
