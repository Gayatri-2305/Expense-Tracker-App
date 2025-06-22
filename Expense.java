@Entity(tableName = "expense_table")
public class Expense {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
}
