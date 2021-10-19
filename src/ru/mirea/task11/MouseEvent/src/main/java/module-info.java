module ru.mirea.task11.mouseevent {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.accessibility;


    opens ru.mirea.task11.mouseevent to javafx.fxml;
    exports ru.mirea.task11.mouseevent;
}