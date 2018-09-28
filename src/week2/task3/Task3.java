package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Student {
    private String name, address;
    private double avgPoint, GPA;
    private int absent;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Xếp loại sinh viên
     */
    public void rateStudent() {
        if (this.avgPoint > 9 && this.avgPoint <= 10)
            System.out.println("Excellent!!");
        else if (this.avgPoint > 8 && this.avgPoint <= 9)
            System.out.println("GREAT!!");
        else if (this.avgPoint > 7 && this.avgPoint <= 8)
            System.out.println("Rather");
        else if (this.avgPoint >= 5 && this.avgPoint <= 7)
            System.out.println("Normal");
        else
            System.out.println("Bad!!");
    }

    /**
     * Kiểm tra sinh viên có phải học lại không
     * true = học lại
     */
    public boolean checkStudyAgain() {
        if (this.absent >= 3)
            return true;
        return false;
    }

    /**
     * kiểm tra sinh viên có được học bổng không
     * true = có được học bổng
     */
    public boolean checkschoolarship() {
        if (this.GPA >= 3.2)
            return true;
        return false;
    }
}

class Employee {
    private String name;
    private int absentOfMonth, absentOfYear, achievements;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAbsentOfMonth() {
        return absentOfMonth;
    }

    public void setAbsentOfMonth(int absentOfMonth) {
        this.absentOfMonth = absentOfMonth;
    }

    public int getAbsentOfYear() {
        return absentOfYear;
    }

    public void setAbsentOfYear(int absentOfYear) {
        this.absentOfYear = absentOfYear;
    }

    /**
     * tính tiền lương hàng tháng của nhân viên
     */
    public double paySalary() {
        long result = (30 - this.absentOfMonth) * 120000;
        return result;
    }

    /**
     * Kiểm tra thưởng cuối năm
     */
    public boolean checkBonus() {
        if (this.absentOfYear < 3)
            return true;
        return false;
    }

    /**
     * Kiểm tra thăng chức
     */
    public boolean checkToPromote() {
        if (achievements > 2)
            return true;
        return false;
    }
}

class Company {
    private String name, address, kind;
    private long moneyEarn, moneyUse;

    public long getMoneyEarn() {
        return moneyEarn;
    }

    public void setMoneyEarn(long moneyEarn) {
        this.moneyEarn = moneyEarn;
    }

    public long getMoneyUse() {
        return moneyUse;
    }

    public void setMoneyUse(long moneyUse) {
        this.moneyUse = moneyUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Khởi tạo
     */
    public Company(String name, String address, String kind, long moneyEarn, long moneyUse) {
        this.name = name;
        this.address = address;
        this.kind = kind;
        this.moneyEarn = moneyEarn;
        this.moneyUse = moneyUse;
    }

    /**
     * Kiểm tra công ty lỗ vốn hay lãi
     * true = lỗ vốn
     */
    public boolean check() {
        if (moneyEarn - moneyUse < 0)
            return true;
        return false;
    }

    /**
     * In thông in
     */
    public void PrintInfo() {
        System.out.println("Name of Company: " + this.name);
        System.out.println("Address of Company: " + this.address);
    }

}
