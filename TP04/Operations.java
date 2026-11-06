package TP04;

import java.time.LocalDateTime;

public class Operations {
    private LocalDateTime Date;
    private String type;
    private double amount;
    public Operations(String type, double amount, LocalDateTime Date){
        this.type = type;
        this.amount = amount;
        this.Date = Date;
    }
    public double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }
    public LocalDateTime getDate() {
        return Date;
    }
    
}
