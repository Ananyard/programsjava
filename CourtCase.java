class CourtCase {
    int caseId;             
    String caseType;      
    String plaintiff;       
    String defendant;       
    String courtName;       
    String judgeName;       
    String filingDate;      
    String hearingDate;    
    String status;          
    double caseValue;

    void getCourtCaseInfo() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Case Type: " + caseType);
        System.out.println("Plaintiff: " + plaintiff);
        System.out.println("Defendant: " + defendant);
        System.out.println("Court Name: " + courtName);
        System.out.println("Judge Name: " + judgeName);
        System.out.println("Filing Date: " + filingDate);
        System.out.println("Hearing Date: " + hearingDate);
        System.out.println("Status: " + status);
        System.out.println("Case Value: ₹" + caseValue);
        System.out.println("-----------------------------------");
    }
}
