public class RecipeDetailActivity extends AppCompatActivity {
    private TextView title;
    private TextView ingredients;
    private TextView instructions;
    private FloatingActionButton fabFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        title = findViewById(R.id.recipe_title);
        ingredients = findViewById(R.id.recipe_ingredients);
        instructions = findViewById(R.id.recipe_instructions);
        fabFavorite = findViewById(R.id.fab_favorite);

        Recipe recipe = (Recipe) getIntent().getSerializableExtra("recipe");

        if (recipe != null) {
            title.setText(recipe.getTitle());
            ingredients.setText(recipe.getIngredients());
            instructions.setText(recipe.getInstructions());
        }

        fabFavorite.setOnClickListener(v -> {
            // Handle adding to favorites
        });
    }
}
