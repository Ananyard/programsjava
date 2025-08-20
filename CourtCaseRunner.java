public class CourtCaseRunner {
    public static void main(String[] args) {

        CourtCase case1 = new CourtCase(101, "Civil", "Ravi", "Shyam", "City Court A", "Judge Rao", "01-01-2025", "15-01-2025", "Open", 50000.0);
        CourtCase case2 = new CourtCase(102, "Criminal", "Govt", "Arun", "City Court B", "Judge Mehta", "03-01-2025", "20-01-2025", "Scheduled", 100000.0);
        CourtCase case3 = new CourtCase(103, "Family", "Neha", "Amit", "Family Court", "Judge Sharma", "05-01-2025", "25-01-2025", "Pending", 75000.0);
        CourtCase case4 = new CourtCase(104, "Civil", "Kiran", "Rahul", "District Court", "Judge Kulkarni", "07-01-2025", "27-01-2025", "Closed", 43000.0);
        CourtCase case5 = new CourtCase(105, "Property", "Sneha", "Family", "High Court", "Judge Khan", "08-01-2025", "28-01-2025", "Open", 120000.0);
        CourtCase case6 = new CourtCase(106, "Criminal", "Govt", "Unknown", "City Court C", "Judge Lal", "10-01-2025", "30-01-2025", "Scheduled", 90000.0);
        CourtCase case7 = new CourtCase(107, "Family", "Geeta", "Mahesh", "Family Court B", "Judge Patel", "12-01-2025", "01-02-2025", "Pending", 60000.0);
        CourtCase case8 = new CourtCase(108, "Civil", "Shalini", "Anil", "District Court B", "Judge Iyer", "13-01-2025", "02-02-2025", "Open", 81000.0);
        CourtCase case9 = new CourtCase(109, "Criminal", "Govt", "Manoj", "City Court D", "Judge Ramesh", "15-01-2025", "04-02-2025", "Closed", 65000.0);
        CourtCase case10 = new CourtCase(110, "Family", "Asha", "Ravi", "Family Court C", "Judge Naik", "16-01-2025", "05-02-2025", "Scheduled", 70000.0);
        CourtCase case11 = new CourtCase(11, "Cybercrime", "TechCorp Ltd.", "HackerX", "Cyber Court Delhi", "Justice Sharma", "2024-01-05", "2024-02-10", "Pending", 3.2);
        CourtCase case12 = new CourtCase(12, "Contract Dispute", "BuildCon", "MegaStructures", "High Court Mumbai", "Justice Nair", "2023-09-12", "2023-10-20", "In Progress", 11.4);
        CourtCase case13 = new CourtCase(13, "Fraud", "Finance Corp", "John Matrix", "District Court Bhopal", "Justice Sinha", "2023-07-20", "2023-08-05", "Closed", 6.3);
        CourtCase case14 = new CourtCase(14, "Family", "Neeta", "Kiran", "Family Court Kochi", "Justice Kumar", "2024-04-01", "2024-04-25", "Pending", 1.1);
        CourtCase case15 = new CourtCase(15, "Tax Evasion", "Income Tax Dept.", "ABC Pvt Ltd", "Tax Court Delhi", "Justice Raj", "2022-12-10", "2023-01-20", "Appeal", 14.7);
        CourtCase case16 = new CourtCase(16, "Consumer Complaint", "Ramesh Kumar", "XYZ Electronics", "Consumer Court Patna", "Justice Desai", "2023-10-15", "2023-11-10", "Resolved", 0.6);
        CourtCase case17 = new CourtCase(17, "Environmental", "GreenEarth NGO", "PolluChem Ltd.", "Green Tribunal", "Justice Iyer", "2024-02-11", "2024-03-05", "In Progress", 8.4);
        CourtCase case18 = new CourtCase(18, "Medical Negligence", "Shalini Rao", "City Hospital", "District Court Pune", "Justice Verma", "2023-11-20", "2024-01-15", "Under Review", 5.0);
        CourtCase case19 = new CourtCase(19, "Defamation", "Actor Y", "Magazine X", "High Court Chennai", "Justice Raghavan", "2023-06-18", "2023-07-10", "Appeal", 4.3);
        CourtCase case20 = new CourtCase(20, "Property Dispute", "Suresh", "Ramesh", "District Court Mysore", "Justice Kiran", "2022-05-10", "2022-06-15", "Closed", 2.9);

       
        case1.getCourtCaseInfo();
        case2.getCourtCaseInfo();
        case3.getCourtCaseInfo();
        case4.getCourtCaseInfo();
        case5.getCourtCaseInfo();
        case6.getCourtCaseInfo();
        case7.getCourtCaseInfo();
        case8.getCourtCaseInfo();
        case9.getCourtCaseInfo();
        case10.getCourtCaseInfo();
        case11.getCourtCaseInfo();
        case12.getCourtCaseInfo();
        case13.getCourtCaseInfo();
        case14.getCourtCaseInfo();
        case15.getCourtCaseInfo();
        case16.getCourtCaseInfo();
        case17.getCourtCaseInfo();
        case18.getCourtCaseInfo();
        case19.getCourtCaseInfo();
        case20.getCourtCaseInfo();
    }
}
