import java.util.Scanner;

public class InsuranceCalculationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insurance Number: ");
        String insuranceNumber = sc.next();
        System.out.print("Insurance Name: ");
        String insuranceName = sc.next();
        System.out.print("Amount covered: ");
        double amount = sc.nextDouble();
        System.out.println("Select: \n1.Life Insurance \n2.Motor Insurance");
        int option = sc.nextInt();
        Insurance ins=null;
        if (option == 1) {
            LifeInsurance lifeinsurance=new LifeInsurance();
            lifeinsurance.setInsuranceNo(insuranceNumber);
            lifeinsurance.setInsuranceName(insuranceName);
            lifeinsurance.setAmountCovered(amount);

            System.out.print("Policy Term: ");
            int policyTerm = sc.nextInt();
            lifeinsurance.setPolicyTerm(policyTerm);

            System.out.print("Benefit Percent: ");
            float benefitPercent = sc.nextFloat();
            lifeinsurance.setBenefitPercent(benefitPercent);

            ins=lifeinsurance;
            }
        else if (option == 2) {
            MotorInsurance motorInsurance=new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNumber);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amount);
            System.out.print("Depreciation Percent: ");
            Float depreciationPercent = sc.nextFloat();
            motorInsurance.setDepPercent(depreciationPercent);

            ins =motorInsurance;
            }
        double premium=addPolicy(ins,option);
        System.out.println("Calculated Premium: "+premium);
    }
    public static double addPolicy(Insurance ins,int option){
        if(option==1){
            LifeInsurance lifeinsurance=(LifeInsurance) ins;
            return lifeinsurance.calculatePremium();
        }
        else if(option==2){
            MotorInsurance motorInsurance=(MotorInsurance) ins;
            return motorInsurance.calculatePremium();
        }
        return 0;
    }
}
