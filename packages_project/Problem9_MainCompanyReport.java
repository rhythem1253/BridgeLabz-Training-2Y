import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

/*
Sub-packages are independent of parent packages. com.company.analytics.sales is NOT the same as com.company.analytics.
*/
public class Problem9_MainCompanyReport {
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();
        System.out.println("Company Combined Report:");
        s.printRegionSales();
        e.printEmployeePerformance();
    }
}
