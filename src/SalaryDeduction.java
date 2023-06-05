
public class SalaryDeduction {
    int workDays;
    int rate;
    int grossPay;
    public double tax;
    public double pagibig;
    public double sss;
       
    SalaryDeduction(int workDays, int rate, int grossPay) {
    
    this.workDays = workDays;
    this.rate = rate;
    this.grossPay = grossPay;    
  }
    public void deductTax() {                        
            if (grossPay < 30000){
                tax= grossPay * 0.05; //5%                                                     
            }
            else if (grossPay >= 30000 && grossPay <= 50000) {        
                tax= grossPay * 0.07; //7%                                              
            }
            else {
                tax= grossPay * 0.10; //10%                              
            }            
     }
    
     public void deductSSS() {
         
            double employeePercent = 3.63 / 100;
            double employerPercent = 7.37 / 100; //For context on how much will be the employer's share            
            
            if (grossPay < 5000){
                sss= 300 * employeePercent;              
            }
            else if (grossPay >=5000 && grossPay <=10000){
                sss= 600 * employeePercent;                
                                
            }
            else if (grossPay >10000 && grossPay < 16000){
                sss= 1000 * employeePercent;                            
            }
            else {
                sss= 1760 * employeePercent;               
            }             
     }    
    public void deductPagibig() {                  
            if (grossPay >= 10000 && grossPay <= 80000){
                double percentDeduct= 4.00/100;                
                pagibig = grossPay * percentDeduct;
                              
            }           
     }
}
