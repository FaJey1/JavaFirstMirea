module ru.mirea.task9.tk9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.task9.tk9 to javafx.fxml;
    exports ru.mirea.task9.tk9;
}