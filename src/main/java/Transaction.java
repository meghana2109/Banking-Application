import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    public int transactionId;
    public int accountNumber;
    public String transactionType;
    public String date;
    public int amount;
}
