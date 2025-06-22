public class ExpenseViewModel extends AndroidViewModel {
    private ExpenseRepository repository;
    private LiveData<List<Expense>> allExpenses;

    public ExpenseViewModel(@NonNull Application application) {
        super(application);
        repository = new ExpenseRepository(application);
        allExpenses = repository.getAllExpenses();
    }

    public void insert(Expense expense) {
        repository.insert(expense);
    }

    public LiveData<List<Expense>> getAllExpenses() {
        return allExpenses;
    }
}
