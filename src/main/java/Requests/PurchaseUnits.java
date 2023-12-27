package Requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class PurchaseUnits {
  private Items []items;
  private Amount amount;


}
