public class productClass {
    int proid;
    String proname;
    double proprice;
    productClass(int pid, String pname, double pprice) {
        proid=pid;
        proname=pname;
        proprice=pprice;

    }
    void Display(){
        System.out.println("Product Id :"+"\t"+proid+"\t"+"Product Name : "+"\t"+proname+"\t"+"Product Price : "+"\t"+proprice);
    }
}
