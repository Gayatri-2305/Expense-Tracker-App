public class AddExpenseDialog extends Dialog {
    private final OnExpenseAddedListener listener;

    public interface OnExpenseAddedListener {
        void onExpenseAdded(Expense expense);
    }

    public AddExpenseDialog(@NonNull Context context, OnExpenseAddedListener listener) {
        super(context);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_add_expense);

        EditText desc = findViewById(R.id.inputDescription);
        EditText amt = findViewById(R.id.inputAmount);
        EditText cat = findViewById(R.id.inputCategory);
        Button addBtn = findViewById(R.id.btnAdd);

        addBtn.setOnClickListener(v -> {
            String description = desc.getText().toString();
            double amount = Double.parseDouble(amt.getText().toString());
            String category = cat.getText().toString();
            listener.onExpenseAdded(new Expense(description, amount, category));
            dismiss();
        });
    }
}
