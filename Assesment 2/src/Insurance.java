
    public class Insurance {
        private String insuranceNo;
        private String insuranceName;
        private Double amountCovered;

        public String getInsuranceNo() {
            return insuranceNo;
        }
        public void setInsuranceNo(String insuranceNo) {
            this.insuranceNo = insuranceNo;
        }
        public String getInsuranceName() {
            return insuranceName;
        }
        public void setInsuranceName(String insuranceName) {
            this.insuranceName = insuranceName;

        }
        public Double getAmountCovered() {
            return amountCovered;
        }
        public void setAmountCovered(Double amountCovered) {
            this.amountCovered = amountCovered;
        }
    }
    class MotorInsurance extends Insurance {
        private Double idv;
        private Float depPercent;

        public Double getIdv() {
            return idv;
        }
        public void setIdv(Double idv) {
            this.idv = idv;
        }
        public Float getDepPercent() {
            return depPercent;
        }
        public void setDepPercent(Float depPercent) {
            this.depPercent = depPercent;
        }
        public Double calculatePremium(){
            idv=getAmountCovered()-((getDepPercent()*depPercent)/100);
            return (idv * 0.03);
        }
    }
    class LifeInsurance extends Insurance {
        private int policyTerm;
        private float benefitPercent;

        public int getPolicyTerm() {
            return policyTerm;
        }
        public void setPolicyTerm(int policyTerm) {
            this.policyTerm = policyTerm;
        }
        public float getBenefitPercent() {
            return benefitPercent;
        }
        public void setBenefitPercent(Float benefitPercent) {
            this.benefitPercent = benefitPercent;
        }
        public double calculatePremium(){
            return (getAmountCovered()-((getAmountCovered()*benefitPercent)/100))/policyTerm;

        }
    }


