package Entity;


import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.ArrayList;
import com.vladmihalcea.hibernate.type.json.JsonType;




@Entity
@Table(name = "Customer")


@TypeDefs(
        {
                @TypeDef(name ="Json",typeClass= JsonType.class)
        }
)

public class Customer {
    @Id
    @Column(name="Customer_id",length = 45)
    private int CustomerId;


    @Column(name = "customer_name",length = 100,nullable = false)
    private String CustomerName;


    @Column(name = "customer_address")
    private String CustomerAddress;

    @Type(type="json")
    @Column(name = "ContactNumber",columnDefinition = "json")
    private ArrayList ContactNumber;

    @Column(name = "nic")
    private String nic;

    @Column(name="active_Status",columnDefinition = "TINYINT default 0")
    private boolean ActiveStatus;


    public Customer() {
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public ArrayList getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActiveStatus() {
        return ActiveStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        ActiveStatus = activeStatus;
    }

    public Customer(int customerId, String customerName, String customerAddress, ArrayList contactNumber, String nic, boolean activeStatus) {
        CustomerId = customerId;
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        ContactNumber = contactNumber;
        this.nic = nic;
        ActiveStatus = activeStatus;



    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId=" + CustomerId +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerAddress='" + CustomerAddress + '\'' +
                ", ContactNumber=" + ContactNumber +
                ", nic='" + nic + '\'' +
                ", ActiveStatus=" + ActiveStatus +
                '}';
    }
}
