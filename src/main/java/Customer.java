import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

    public int customerId;
    public String firstName;
    public String lastName;
    public String address;
    public int accountNumber;

}
