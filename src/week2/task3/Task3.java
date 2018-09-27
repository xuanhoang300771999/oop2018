package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Employee {
    private String name;                                          // Tên của nhân viên
    private int age;                                              // Tuổi của nhân viên
    private String IdCard;                                        // Số chứng minh nhân dân

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Phương tính tính thời gian người đó đi làm
    public double TimeGoToWord() {
        return 0;
    }

    // Tính lương hàng tháng
    public double salaryofmonth() {
        return 0;
    }

    // đã lập gia đình hay chưa
    public boolean HaveAFamily() {
        return false;
    }
}

class Bank {
    private String address;                               // Địa chỉ của ngân hàng
    private String name;                                  // Tên của ngân hàng
    private int totalOfEmployee;                          // Tổng số nhân viên trong ngân hàng

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalOfEmployee() {
        return totalOfEmployee;
    }

    public void setTotalOfEmployee(int totalOfEmployee) {
        this.totalOfEmployee = totalOfEmployee;
    }

    //Tổng cổ phần của ngân hàng
    public double TotalMoney() {
        return 0;
    }

    //Tính tổng tiền lương cho nhân viên hàng tháng
    public double TotalSalaryForEmployee() {
        return 0;
    }

    // Tính lợi nhuận hàng năm của ngân hàng
    public double AnnualProfit() {
        return 0;
    }
}

class Student {
    private String name;                                    // Tên của học sinh
    private String adress;                                  // Địa chỉ nhà
    private String DateOfBirth;                             // Ngày tháng năm sinh của học sinh đó

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    // Tính tổng thời gian đi học
    public int TimeAtSchool() {
        return 0;
    }

    // Tính tiền học hàng tháng
    public double MoneyForStudying() {
        return 0;
    }

    // Tính điểm trung bình các môn
    public double AverageMark() {
        return 0;
    }
}
