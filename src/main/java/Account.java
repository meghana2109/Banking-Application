import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {

    public int accountID;
    public int accountNumber;
    public String accountType;
    public int balance;
}
