module com.example.pokemonsdlike {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pokemonsdlike to javafx.fxml;
    exports com.example.pokemonsdlike;
}