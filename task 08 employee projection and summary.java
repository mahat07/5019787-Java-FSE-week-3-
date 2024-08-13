package com.example.employeemanagementsystem.projection;

public interface EmployeeProjection {
    Long getId();
    String getName();
}
package com.example.employeemanagementsystem.projection;

public class EmployeeSummary {
    private Long id;
    private String name;

    public EmployeeSummary(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
