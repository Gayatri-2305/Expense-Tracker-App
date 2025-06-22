public class ExpenseAdapter extends RecyclerView.Adapter<ExpenseAdapter.ExpenseHolder> {
    private List<Expense> expenses = new ArrayList<>();

    @NonNull
    @Override
    public ExpenseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_expense, parent, false);
        return new ExpenseHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ExpenseHolder holder, int position) {
        Expense current = expenses.get(position);
        holder.textViewDesc.setText(current.getDescription());
        holder.textViewAmt.setText("₹" + current.getAmount());
        holder.textViewCat.setText(current.getCategory());
    }

    @Override
    public int getItemCount() {
        return expenses.size();
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
        notifyDataSetChanged();
    }

    class ExpenseHolder extends RecyclerView.ViewHolder {
        private TextView textViewDesc, textViewAmt, textViewCat;

        public ExpenseHolder(View itemView) {
            super(itemView);
            textViewDesc = itemView.findViewById(R.id.desc);
            textViewAmt = itemView.findViewById(R.id.amount);
            textViewCat = itemView.findViewById(R.id.category);
        }
    }
}
