package ecommerce.application;

import ecommerce.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Mengcoding");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Muhamad Krisnandi");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
